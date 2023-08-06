x = input("enter:")  # User enters a string, e.g., "123"
integer_list = [int(char) for char in x]  # Convert each character to an integer and create a list
print("Input:",integer_list)  # Print the list of integers: [1, 2, 3]
s=''
for i in integer_list:
    x = str(i)
    s= s+x
    y = int(s)
    y = y+1
y1 = str(y)
integer_list2 = [int(char) for char in y1]  # Convert each character to an integer and create a list
print("Output:", integer_list2)