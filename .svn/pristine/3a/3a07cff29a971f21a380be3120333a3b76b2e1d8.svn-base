
package com.caafc.pbocAnalysis.webService.test;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.caafc.pbocAnalysis.webService.pbocService.PbocRequest;
import com.caafc.pbocAnalysis.webService.pbocService.PbocResponse;
import com.caafc.pbocAnalysis.webService.pbocService.PbocService;
/*
 * 并发测试TestBingFa
 * count：并发数
 */
public class TestBingFa {  
    public static void main(String[] args) {  
         int count = 160;  
         CyclicBarrier cyclicBarrier = new CyclicBarrier(count);  
         ExecutorService executorService = Executors.newFixedThreadPool(count);  
         for (int i = 0; i < count; i++)  
              executorService.execute(new TestBingFa().new Task(cyclicBarrier));  
 
         executorService.shutdown();  
         while (!executorService.isTerminated()) {  
              try {  
                   Thread.sleep(10);  
              } catch (InterruptedException e) {  
                   e.printStackTrace();  
              }  
         }  
    }  
 
    public class Task implements Runnable {  
    	//PbocRequest pbocRequest = new PbocRequest();
         private CyclicBarrier cyclicBarrier;  
 
         public Task(CyclicBarrier cyclicBarrier) {  
              this.cyclicBarrier = cyclicBarrier;  
         }  
 
         @Override  
         public void run() {  
              try {  
                   // 等待所有任务准备就绪  
                   cyclicBarrier.await();  
                   // 测试内容  
                long start = System.currentTimeMillis();
           		JaxWsProxyFactoryBean fa = new JaxWsProxyFactoryBean();
           		fa.setServiceClass(PbocService.class);	// 审批
           		
           		fa.setAddress("http://localhost:8080/pbocAnalysis/PbocService");
           		
           		PbocService service = (PbocService) fa.create();
           		PbocRequest pbocRequest = new PbocRequest();
           		pbocRequest.setPbocFilePath("/ZXJX/cfstest/20170321/Card410482198406093833By135553625.a");

           		PbocResponse _return = service.pbocTarget(pbocRequest);
           		long end = System.currentTimeMillis();
           		long time = end -start;
              } catch (Exception e) {  
                   e.printStackTrace();  
              }  
         }  
    }  
}  


/*public class TestBingFa {  
	  public static void main(String[] args) {  
        int count = 3;  
        ExecutorService executorService = Executors.newFixedThreadPool(count);  
        for (int i = 0; i < count; i++)  
             executorService.execute(new TestBingFa().new Task());  

        executorService.shutdown();  
        while (!executorService.isTerminated()) {  
             try {  
                  Thread.sleep(10);  
             } catch (InterruptedException e) {  
                  e.printStackTrace();  
             }  
        }  
   }  

   public class Task implements Runnable {  
  	 PbocRequest pbocRequest = new PbocRequest();
        @Override  
        public void run() {  
             try {  
                  // 测试内容  
         		pbocRequest.setPbocFilePath("/ZXJX/cfstest/20170321/Card410482198406093833By135553625.a");
         		System.out.println(1);
             } catch (Exception e) {  
                  e.printStackTrace();  
             }  
        }  
   }  
} */ 