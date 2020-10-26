# MultiThreadingExample

What is multithreading ?
---------------------------
Multithreading is when one or more CPU's in a system provide more than one thread of execution. A thread is a path which is followed during a program's execution. When a program is being run, a process is executed. Within that process there can be one or more threads. A thread is like a lightweight process. 



When to use multithreading ?
--------------------------------
Multithreading enhances a programs running in speed, responsiveness, scalability and economy. An good example to use multithreading is when setting up a server that needs to connect to multiple clients at the same time.  When using multithreading those clients can work independently. 




What are the three most common problems with multithreading?
------------------------------------------------------------
A common problem is when different threads interfere with each other when sharing resources. Furthermore the complexity of a program increases. Testing can also be more difficult. 

- Deadlock
- Race condition
- Stack Overflow





What do you call the objects are placed in memory?
--------------------------------------------------
Objects are stored on the heap. Objects reference is stored on the stack memory/frame. 




What do you call where methods are executed and primitive types are saved?, and how is this different in multithreadin applications?
------------------------------------------------------------------------------------------------------------------------------------
The stack and the corresponding stack frame or stack memory. 




What is a recing condition, and how can you avoid it?
--------------------------------------------------------
A race condition is when two or more threads read and write to the same data. A simpel fix is to use the synchronize keyword in java so that only one thread can execute the method at a time. 



