// JavaScript Program demonstrating Operators

// Arithmetic Operators
let a = 10, b = 5;
console.log("Arithmetic Operators:");
console.log("a + b = " + (a + b));  // Addition
console.log("a - b = " + (a - b));  // Subtraction
console.log("a * b = " + (a * b));  // Multiplication
console.log("a / b = " + (a / b));  // Division
console.log("a % b = " + (a % b));  // Modulus

// Relational Operators
console.log("\nRelational Operators:");
console.log("a > b: " + (a > b));   // Greater than
console.log("a < b: " + (a < b));   // Less than
console.log("a == b: " + (a == b)); // Equal to
console.log("a != b: " + (a != b)); // Not equal to
console.log("a >= b: " + (a >= b)); // Greater than or equal to
console.log("a <= b: " + (a <= b)); // Less than or equal to

// Logical Operators
let isTrue = true, isFalse = false;
console.log("\nLogical Operators:");
console.log("isTrue && isFalse: " + (isTrue && isFalse)); // AND
console.log("isTrue || isFalse: " + (isTrue || isFalse)); // OR
console.log("!isTrue: " + (!isTrue)); // NOT

// Assignment Operators
let num = 20;
console.log("\nAssignment Operators:");
console.log("num = " + num);  // Assignment
num += 5;  // num = num + 5
console.log("num += 5: " + num);
num -= 3;  // num = num - 3
console.log("num -= 3: " + num);
num *= 2;  // num = num * 2
console.log("num *= 2: " + num);
num /= 4;  // num = num / 4
console.log("num /= 4: " + num);

// Unary Operators
let y = 5;
console.log("\nUnary Operators:");
console.log("++y: " + (++y)); // Increment
console.log("--y: " + (--y)); // Decrement
console.log("y++: " + (y++)); // Post-increment
console.log("y--: " + (y--)); // Post-decrement

// Ternary Operator
let age = 18;
let result = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
console.log("\nTernary Operator:");
console.log(result);
