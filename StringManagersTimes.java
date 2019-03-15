package lab04;

public class StringManagersTimes {
    
    
        public static void main(String[] args){  
            long startTime = System.currentTimeMillis();  
            StringBuffer sbuffer = new StringBuffer("Java");  
            for (int i=0; i<90000; i++){  
                sbuffer.append("Java");  
            } 
            long endTime = System.currentTimeMillis();
            System.out.println("Time taken by StringBuffer: " + (endTime- startTime) + "ms");  
            
            startTime = System.currentTimeMillis();  
            StringBuilder sbuilder = new StringBuilder("Java");  
            for (int i=0; i<90000; i++){  
                sbuilder.append("Java");  
            }  
            endTime = System.currentTimeMillis();
            System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + "ms");  
            
            startTime = System.currentTimeMillis();  
            String str = "";  
            for (int i=0; i<90000; i++){  
                str+=("Java");  
            } 
            endTime = System.currentTimeMillis();
            System.out.println("Time taken by String: " + (endTime - startTime) + "ms");  
        }  
    }  

