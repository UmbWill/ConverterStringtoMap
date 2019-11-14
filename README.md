# ConverterStringtoMap
An easy converter from string to HashMap

A very simple and portable converter!
Create a new instance and call **convert(String, HashMap<String,String>)**
* Input:
feed this function with the 'map string' and the 'output HashMap'.
* Output:
  * true: if the string is a map and the final map is not empty
  * false: in other cases

## Unique cases
Pay attention to the follow string cases:
* "{map= }" : this is consider a HashMap, with key "map" and empty value
* "{map=}" : this is not a HashMap, because the value is empty
