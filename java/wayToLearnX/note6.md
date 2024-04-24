## 1: 
## 2: 
## 3: 
## 4: The lifecycle of a Java thread involves several states which are:
* **New:** The thread is  created, but not yet started. <br>
* **Runnable:** After calling **start()**, the thread enters the runnable state and it is ready to run, but wait that the scheduler select it before running thread.<br>
* **Blocked:** A thread moves to the blocked state when it wants to access an object that another thread has locked. It will remain in this state until the requested resource is available.<br>
* **Waiting:** A thread moves to the waiting state while it waits for another thread to perform a particular action. It will stay in this state until it receives a notification or an interrupt.<br>
* **Timed Waiting:** Similar to waiting, but for a specified interval of time. The thread will move to the runnable state after the specified time elapses.<br>
* **Terminated:** A thread enters this state when its run() method completes, or an uncaught exception occurs. Once terminated, a thread cannot return to a runnable state.
## 5: 
## 6: 
## 7: 
## 8:  System.out.println('H' + 'e' + 'l' + 'l' + 'o'); = 500
Due to the fact that we are using  **' '** instead of  **" "** , java understand that the charters as ASCII value
```
class Main4 {
        public static void main(String[] args)
        {
            System.out.println('H' + 'e' + 'l' + 'l' + 'o');
        }
     
}
```
## 9: 
## 10: 