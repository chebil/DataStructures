# The Efficiency of Algorithms
## Timing algorithms
>How do you determine the running time of an algorithm? 

Java includes methods for determining the current time to a high precision.
To compute the runnig time of a method we take the time before the method execution using "System.currentTimeMillis()" and the time after the method execution and then we compute the difference. 
```Java 
long start_time = System.currentTimeMillis();// The time the algorithm started

// You call your method here...

long end_time = System.currentTimeMillis();// The time the algorithm ended
System.out.println("The algorithm took " + (end_time-start_time) + 
                " milliseconds.");
```
## Task 1
Define a method "
