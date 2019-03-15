# StringClasses
Difference between the three classes provided by Java to manage strings: String, StringBuilder, StringBuffer

String Buffer works synchronized. This means that when working with thread programming, two or more threads cannot 
call an String Builder simultaneously. This affects to the performarce of the method an its slower than the  String Builder method

String Builder works non-synchronizes. This class is the worst to use when working with threads but it provides a
better performance than String Buffer. When using mono thread programs, this method is ideal for the management of
strings

Strinc class is the worst of the three when performing operations. If we want to expand a String ( String s += "blabla";), this operation will destroy the previous String and create it again concatenated with the new value. This causes high execution times when performing a high number of concatenations.


In the snippset of code attached it is show the measurement times for the execution of a concatenation operations 
n times.
