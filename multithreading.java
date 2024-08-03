package multithreading;

class ThreadCount extends Thread{

ThreadCount(){

super("Overriding Thread Class");

System.out.println("New thread created" + this);

start();

}

public void run(){ //Run Method

    try{

        for (int i=0 ;i<10;i++){

System.out.println("New thread created" + this);

Thread.sleep(1500);

        }

    }

    catch(InterruptedException e){

System.out.println("Currently executing thread is interrupted");

}

System.out.println("Currently executing thread run is terminated" );

}

}

public class MultiThreading{

public static void main(String args[]){

ThreadCount C = new ThreadCount();

try{

while(C.isAlive()){

System.out.println("Main Method Thread will be alive, until it's Child Thread stays alive");

Thread.sleep(2500); //Sleep method

}

}

catch(InterruptedException e){

System.out.println("Main Method thread is interrupted");

}

System.out.println("Main Method's thread run is terminated" );

}

}