# filereader
By Thanaphon Keawjam

I ran the tasks on a notebook with i7-6700HQ CPU @ 2.60GHz 2.59GHz, and i got these results:

Task                                                         |     Time
------------------------------------------------------------|---------------
Read file 52539-chars at a time to String                    | 0.946025 sec
Read file 52539-chars at a time to StringBuilder             | 0.003322 sec
Read file 52539-chars at a time to lines to String           | 0.923343 sec


## Explanation of Results
String reads the slowerest because it reads 1 char at a time.

Example : "code" First it reads 'c'. Next, it reads "co". Next "cod". Last "code".

BufferedReader reads the second fastest because it reads line by line.

StringBuilder reads the fastest because it reads word by word then combine its.

Example : if z refers to a string builder object whose current contents are "start", then the method call z.append("le") would cause the string builder to contain "startle".
