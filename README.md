<h1>Factorial Calculation in Parallel</h1>
<p>This project demonstrates the use of multithreading in Java to calculate the factorial of numbers from 0 to 99 in parallel.</p>
    
<h2>Task</h2>
<p>You need to write logic to create 100 threads, each of which will calculate the factorial of the index in a loop and save the result to the results array. You also need to wait for all threads to complete before outputting the results. (join method)</p>

<h3>Warning</h3>
<p>Don't change anything other than the method <code>calculateFactorialsInParallel()</code></p>

<h2>Implementation Plan</h2>
<ol>
    <li><strong>Create an array of threads:</strong> Create an array of Thread objects where each element represents a different thread. The size of this array should be equal to the size of the array you are processing (<code>SIZE_MASSIVE = 100</code>).</li>
    <li><strong>Initialize each thread:</strong> In the loop that runs through each element of the array, create a new thread. Inside this thread, perform the necessary task (calculate the factorial of the index). In this case, the task is to calculate the factorial for the index and store the result in the results array.</li>
    <li><strong>Start the threads:</strong> After creating each thread, call the <code>start()</code> method to start it.</li>
    <li><strong>Wait for all threads to complete:</strong> After all threads are started, use the <code>join()</code> method for each thread to have the main thread of the program wait for all created threads to complete. This ensures that all calculations are completed before the main program thread continues executing.</li>
</ol>
