##String Calculator

* An empty string returns zero
* A single number returns the value
* Two numbers, comma delimited, returns the sum
* Two numbers, newline delimited, returns the sum
* Three numbers, delimited either way, returns the sum
* Negative numbers throw an exception
* Numbers greater than 1000 are ignored
* To change a delimiter, the beginning of the string will contain a separate line that looks like this: “//[delimiter]\n[numbers…]” for example “//;\n1;2” should return three where the default delimiter is ‘;’ .
* The first line is optional. All existing scenarios should still be supported
* A multi char delimiter can be defined on the first line (e.g. //[###] for ‘###’ as the delimiter)
* Many single or multi-char delimiters can be defined (each wrapped in square brackets)


http://osherove.com/tdd-kata-1/

https://sites.google.com/site/tddproblems/all-problems-1