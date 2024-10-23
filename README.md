class Resource{  
synchronized void x(int n){//method not synchronized  
   for(int i=1;i<=5;i++){  
     System.out.println(n*i);   
 }  
}  
}
  
class Ct1 extends Thread{  

Resource r;  
Ct1(Resource r){  
this.r=r;  
}  
public void run(){  
r.x(10);  
}  
  
}  
class Ct2 extends Thread{  
Resource r;  
Ct2(Resource r){  
this.r=r;  
}  
public void run(){  
r.x(100);  
}  
}  
  
class TestSynchronization1{  
public static void main(String args[]){  
Resource r1 = new Resource();//only one object  
Ct1 t1=new Ct1(r1);  
Ct2 t2=new Ct2(r1);  
t1.start();
//t1.sleep(10000);  
t2.start();  
}  
}  
