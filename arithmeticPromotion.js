// JavaScript program to demonstrate arithmetic promotion

// Declare variables
let intVar = 10;       // Integer
let floatVar = 2.5;    // Floating point number

// Arithmetic promotion happens when smaller data types are automatically promoted to larger data types

// Example: Adding an integer and a float
let result = intVar + floatVar; // intVar will be promoted to float

// Displaying the result
console.log("The result of the promotion (int + float) is: " + result);

// Further example with other operations
let divisionResult = intVar / floatVar; // Promotion during division as well
console.log("The result of intVar / floatVar is: " + divisionResult);
