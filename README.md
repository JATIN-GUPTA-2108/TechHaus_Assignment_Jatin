-Problem 1
Write a program that prints the number of digits in an integer. For example, given the
integer “34” (without quotes) as the input, the program must print “2” (without quotes)
as the output, given “-7291” (without quotes), the program must print “4” (without
quotes), and so on.
-Problem 2
A supermarket sells thousands of products. Every product is properly packaged and
the product packaging shows the total price a customer must pay for the product.
The total product price includes taxes and the rate of taxation varies from product to
product. For legal reasons, the supermarket must provide invoices to every customer
that show the price of each product before taxes, the tax rate and the tax amount.
Write a program that takes the net price of a product including taxes and the tax rate,
and computes the gross price before taxes. The table below shows some examples
for the expected output of the program.

Input Output
Net Price Tax Rate Gross Price
99.95 0.12 89.24
49,999.00 0.28 39,061.72
720.00 0.05 685.71
45.00 0.00 45.00

-Problem 3
Write a program that accepts two numbers and returns the larger of the two.


-Problem 4
Write a program that finds the median of a sorted array of numbers, where the
median of an array is defined as the number exactly in the middle of the sorted array.
When the array contains an odd number of numbers, the median is the number
exactly in the middle and when the array contains an even number of numbers, the
median is the average of the two numbers exactly in the middle. The table below
shows some sorted arrays, their middle elements and their medians.
Array Median
10.7 10.7
1.0, 2.0, 3.0 2.0
17.4, 21.1, 39.7, 48.0 (21.1 + 39.7) / 2 = 60.8 / 2 = 30.4
-957.0, -493.0, -384.0, -268.0, -131.0 -384.0
If the array does not contain any number, the program must return -1.0.


-Problem 5
Write a program that computes the income tax for a person having specified income,
using the income tax rates shown below.
Taxable Income Income Tax Rate
Up to Rs.2,50,000 0%
More than Rs.2,50,000 and up to
Rs.5,00,000
10% of income over Rs.2,50,000
More than Rs.5,00,000 and up to
Rs.10,00,000
10% of income over Rs.2,50,000 +
20% of income over Rs.5,00,000
More than Rs.10,00,000 10% of income over Rs.2,50,000 +
20% of income over Rs.5,00,000 +
30% of income over Rs.10,00,000
The table below shows some examples of how the tax rates shown above must be
applied for computing the income tax.
Taxable Income Income Tax
Rs.1,90,000 0
Rs.3,45,000 10% x (3,45,000 – 2,50,000)
= 10% x 95,000
= 9,500
Rs.7,80,000 10% x (5,00,000 – 2,50,000)
+ 20% x (7,80,000 – 5,00,000)
= 10% x 2,50,000
+ 20% x 2,80,000
= 25,000 + 56,000
= 81,000
Rs.24,00,000 10% x (5,00,000 – 2,50,000)
+ 20% x (10,00,000 – 5,00,000)
+ 30% x (24,00,000 – 10,00,000)
= 10% x 2,50,000
+ 20% x 5,00,000
+ 30% x 14,00,000
= 25,000 + 1,00,000 + 4,20,000
= 5,45,000


-Problem 6
Write a program that finds the string having the most number of vowels from an array
of strings. For example, given the array “Sunshine” (3 vowels), “Umbrella” (3
vowels), “Major” (2 vowels), “Resourceful” (5 vowels), the program must return the
string “Resourceful”.

-Problem 7
Retail inflation is the average yearly increase in prices of common goods sold in
retail. For example, if the prices of common goods increase on an average by 10% in
a year, the retail inflation is said to be 10%.
Write a program that accepts the rate of retail inflation and number of years, and
prints the compounded inflation at the end of the specified number of years. For
example, if the retail inflation rate is specified as 20% and number of years as 5, the
compounded retail inflation at the end of 5 years will be 1.25 = 2.49 = 149%.

-Problem 8
Write a program that accepts the number of seconds and returns its time equivalent
in days, hours, minutes and seconds. For example, given “21893872” (without
quotes), the program must return “253 Day(s) 9 Hour(s) 37 Minute(s) 52 Second(s)”
(without quotes).

-Problem 9
A two-digit special integer is obtained by adding its individual digits to the product of
the digits. For example, the special two-digit integer “59” is obtained as “5 + 9 + 5 x 9
= 5 + 9 + 45”.
Write a program that accepts an integer and determines if it is a two-digit special
integer.

-Problem 10
Write a program that finds the second largest number from an array of unsorted
numbers.
