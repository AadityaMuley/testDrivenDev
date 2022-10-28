# Test Driven Development - JUnit

### How many urinals are free? 
In men's public toilets with urinals, there is this unwritten rule that you leave at least one urinal free between you and the next person peeing. For example, if there are 3 urinals and one person is already peeing in the left one, you will choose the urinal on the right and not the one in the middle. That means that a maximum of 3 people can pee at the same time on public toilets with 5 urinals when following this rule (Only 2 if the first-person pees into urinal 2 or 4). The application returns the maximum of free urinals as an integer according to the unwritten rule.

### Examples 
1. 10001 returns 1 (10101) <br />
2. 1001 returns 0 (1001) <br />
3. 00000 returns 3 (10101) <br />
4. 0000 returns 2 (1001) <br />
5. 01000 returns 1 (01010 or 01001)  <br />
6. 011 returns -1 <br />

### Input
The application takes a urinal.dat file (placed in src/data/urinal.dat) as input which may contain any number of strings (the program will process it till EOF)

### Output
The output is given in a new text file every time the program is run named rule.txt, rule1.txt, rule2.txt, ...... and so on. (src/output/rule.txt) <br /><br /><br />

## Unit Tests implemented
1. Unit test to check if input file exists
2. Unit test to check if input file is NOT empty
3. Unit test to check if there are no consecutive 1's in any input string
4. Unit test to check if any input string has any other characters except 0's and 1's
5. Unit test to check if any input string is not Null
6. Unit test to check if a output file already exists
7. Unit test to check if the output file name is in correct format, ie, it is valid
