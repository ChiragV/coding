# The State of Coding in 2026
The Confusion: No one fully knows what’s going on. Buzzwords like "Agents," "Vibe Coding," and "AGI" dominate the conversation.

## The Perception:

- "Coding is dead."
- "AI writes 90% of the code."
- "You only need to learn how to prompt."

## The Reality:

- Top AI companies (e.g., Anthropic, OpenAI) are still hiring experts, not just prompters.
- Example: Anthropic "acqui-hired" Jared (creator of Bun) to work on Claude Code—they need "adults in the room" to clean up the mess made by "going fast."

---

# The Risks of "Vibe Coding" (Why You Must Know Code)

## The "Lazy" Developer Problem:

- Anecdote: A hire with 2 years of experience relied entirely on AI.
- The Result: Messy code, undeclared variables, bad merge conflict resolutions, and accidentally deleting working code.
- The Critical Failure: The developer did not read or understand the code the AI wrote.
- The Lesson: You can use AI to move fast, but you must have the skills to audit it. If you can't spot a bug or a logic error yourself, you are a liability.

---

# Are Coding Interviews Dead?

### The Surprise: DSA (Data Structures & Algorithms) is not dead.

- Anthropic & OpenAI: Still ask standard DSA questions.
- Meta: Exploring "AI-assisted" interviews.
- The "AI-Assisted" Trap: Access to AI tools during an interview actually raises the bar. Interviews are harder, not easier.
- You cannot just copy-paste; you must explain why the code works, verify correctness, and understand the logic.

---

# The Competent Developer’s Checklist
What AI Can't Fully Replace (The "Thinking" Skill):

- Correctness: Is this solving the right problem? Are there edge cases?
- Performance: Should I use a Hash Map or an Array? (Even if AI writes it, you must decide the approach).
- Security & Maintainability: Understanding the pros and cons of a solution.

The Verdict: Companies aren't hiring people to solve LeetCode; they are hiring people who can think. Technical skills are the foundation that allows you to use AI effectively without breaking the product.

---

# Why Python?
Python is highly concise and "easier" than most languages (Java/C++).

Goal: Learn "The Church of Python" specifically for coding interviews.

---

# Hello world!

```python
print("Hello World")
```

---

## Variables & Typing

Dynamically Typed: No need to declare types (e.g., n = 0).
Runtime Determination: Variables can change type (e.g., n changes from 0 to "abc").
Multiple Assignment: n, m = 0, "abc" allows assigning multiple variables on one line.

Null Value: Python uses None to represent null.

---

## Section 2: Python Basics and Data Types
Explore Python data types including integers, floats, strings, booleans, and perform basic operations with each type.

```python
# Integers
age = 25
year = 2024
print(f"Age: {age}, Year: {year}")
print(f"Type of age: {type(age)}")

# Floats
height = 5.9
weight = 72.5
print(f"\nHeight: {height}, Weight: {weight}")
print(f"Type of height: {type(height)}")

# Strings
name = "John Doe"
greeting = 'Hello, World!'
print(f"\nName: {name}")
print(f"Type of name: {type(name)}")

# Booleans
is_student = True
is_working = False
print(f"\nIs student: {is_student}")
print(f"Type of is_student: {type(is_student)}")

# Basic operations
result = age + year
product = height * weight
combined = name + " is " + str(age) + " years old"
print(f"\nAddition: {age} + {year} = {result}")
print(f"Multiplication: {height} * {weight} = {product}")
print(f"String concatenation: {combined}")
```

---

## Section 3: Control Flow Statements
Implement if/elif/else statements, for loops, while loops, and loop control statements like break and continue.

If Statements:

- No parentheses around conditions.
- No curly braces {}; use indentation.
- Keyword `elif` instead of `else if`.
- Logic Operators: Uses English words `and`, `or`, `not` (instead of `&&`, `||`, `!`).

```python
# If/elif/else statements
score = 85

if score >= 90:
    print("Grade: A")
elif score >= 80:
    print("Grade: B")
elif score >= 70:
    print("Grade: C")
else:
    print("Grade: F")
```

For Loops:

- Uses `range()`: `for i in range(5)` loops 0 to 4.
- Custom Ranges: `range(2, 6)` loops 2 to 5.
- Reverse: `range(5, 1, -1)` loops backwards from 5 to 2.

```python
# For loops
print("\nFor loop - Print numbers 1 to 5:")
for i in range(1, 6):
    print(i)

print("\nFor loop - Iterate through a list:")
fruits = ["apple", "banana", "cherry"]
for fruit in fruits:
    print(fruit)
```

```python
# While loops with break and continue
print("\nWhile loop with break:")
count = 0
while count < 10:
    if count == 3:
        print("Break at 3")
        break
    print(count)
    count += 1

print("\nWhile loop with continue:")
count = 0
while count < 5:
    count += 1
    if count == 2:
        print("Skip 2, continuing...")
        continue
    print(count)
```

---

## Math Operations & Quirks

Division:

- `/` is decimal division (5 / 2 = 2.5).
- `//` is integer division (5 // 2 = 2).
- Warning: Integer division rounds down (e.g., -3 // 2 = -2, not -1).

Modulo:

- Be careful with negative numbers (-10 % 3 = 2).
- Tip: Use `math.fmod()` to match C/Java behavior for negatives.

Numbers:

- Integers are arbitrary precision (no overflow).
- Infinity: Use `float("inf")` and `float("-inf")`.

---

# Arrays (Lists) - Basics

Structure: Dynamic arrays.

Stack Operations:

- `append()` to push.
- `pop()` to remove from end.

Indexing:

- Read/Write is O(1).
- Negative Indexing: `-1` accesses the last value.
- Slicing: `arr[1:3]` gets values from index 1 up to (but not including) 3.
- Initialization: `arr = [1] * 5` creates `[1, 1, 1, 1, 1]`.

```python
# Arrays (Lists) - Basics

# 1. Initialization (Dynamic array)
arr = [1] * 5
print("Initial array:", arr)

# 2. Append (Push to stack)
arr.append(6)
print("After append:", arr)

# 3. Pop (Remove from end - stack behavior)
removed_value = arr.pop()
print("Removed value:", removed_value)
print("After pop:", arr)

# 4. Indexing (O(1) read/write)
print("Value at index 0:", arr[0])

arr[0] = 10
print("After modifying index 0:", arr)

# 5. Negative Indexing
print("Last value using -1:", arr[-1])

# 6. Slicing
slice_example = arr[1:3]
print("Slice arr[1:3]:", slice_example)
```

---

## Arrays (Lists) - Advanced

Looping:

- Value only: `for n in nums:`
- Index & Value: `for i, n in enumerate(nums):`
- Multiple Arrays: `for n1, n2 in zip(nums1, nums2):`

Sorting:

- `arr.sort()` sorts ascending by default.
- `arr.sort(reverse=True)` for descending.
- Custom Sort: Use lambda functions (e.g., `key=lambda x: len(x)`).

List Comprehension: Concise syntax to create lists (e.g., `[i + i for i in range(5)]`).

2D Arrays Warning: Do not use `[[0]*4]*4` (creates shallow copies). Use list comprehension: `[[0]*4 for i in range(4)]`.

```python
# Initial Data
students = ["Alice", "Bob", "Charlie", "David"]
scores = [88, 92, 78, 95]

### 1. Looping: zip() and enumerate()
print("--- Student Rankings ---")
for i, (name, score) in enumerate(zip(students, scores), start=1):
    print(f"Rank {i}: {name} scored {score}")

### 2. List Comprehension
curved_scores = [min(100, s + 5) for s in scores]
print(f"\nCurved Scores: {curved_scores}")

### 3. Sorting (Standard and Custom)
students.sort()
print(f"Alphabetical: {students}")

students.sort(key=lambda name: len(name))
print(f"Sorted by name length: {students}")

curved_scores.sort(reverse=True)
print(f"Top Scores: {curved_scores}")

### 4. 2D Arrays (The Right Way)
seating_chart = [["Empty" for _ in range(3)] for _ in range(3)]
seating_chart[0][0] = "Alice"
print("\nSeating Chart Row 1:", seating_chart[0])
print("Seating Chart Row 2:", seating_chart[1])
```

---

## Strings

Immutability: Strings cannot be modified (e.g., `s[0] = 'a'` fails). Modifying creates a new string (O(n) operation).

Conversions: convert between ints and strings easily (`int("123")`, `str(123)`).

ASCII: Use `ord("a")` to get the ASCII value.

Join: Use `"".join(list_of_strings)` to combine strings efficiently.

```python
# 1. Immutability: The "Gotcha"
s = "Python"
print(f"Original: {s}")

try:
    s[0] = "p"
except TypeError as e:
    print(f"❌ Error: {e} (You can't change a string in place!)")

# To "modify" it, create a new string
s = "p" + s[1:]
print(f"New string created: {s}")

# 2. Conversions & ASCII
char = "A"
ascii_val = ord(char)
next_char = chr(ascii_val + 1)
print(f"\nASCII of '{char}' is {ascii_val}. The next letter is '{next_char}'.")

# 3. Efficient Joining
parts = ["100", "200", "300", "400"]
combined = "-".join(parts)
print(f"Joined string: {combined}")

# 4. Conversion Logic
first_num = int(parts[0])
print(f"Math on converted string: {first_num} * 2 = {first_num * 2}")
```

---

## Hash Maps & Sets

Hash Sets:

- No duplicates.
- Search/Insert/Remove are $O(1)$.

Hash Maps (Dictionaries):

- Key-Value pairs (no duplicate keys).
- Operations: `map["key"] = val`, `pop("key")`.
- Looping: `.keys()`, `.values()`, `.items()`.

```python
### 1. Hash Sets (No Duplicates)
visitor_ips = {"192.168.1.1", "10.0.0.5", "192.168.1.1"}
print(f"Unique IPs: {visitor_ips}")

unique_squares = {x*x for x in [-2, -1, 0, 1, 2]}
print(f"Unique Squares: {unique_squares}")

### 2. Hash Maps (Dictionaries)
user_logins = {"Alice": 5, "Bob": 12}
user_logins["Charlie"] = 1
user_logins["Alice"] += 1
user_logins.pop("Bob")

print("\n--- User Dashboard ---")
for user, count in user_logins.items():
    print(f"User: {user} | Logins: {count}")

total_logins = sum(user_logins.values())
print(f"Total Logins across site: {total_logins}")

cubes = {i: i**3 for i in range(5)}
print(f"\nCube Map: {cubes}")
```

---

## Advanced Data Structures

Tuples: Immutable sequences; useful as dictionary keys.

Queues: Use `collections.deque` for O(1) append/popleft.

Heaps: Use `heapq`. It's a min-heap by default; use negation for max-heap behavior.

```python
from collections import deque
import heapq

### 1. Tuples: The Immutable Key
locations = {}
point_a = (10, 20)
locations[point_a] = "Main Entrance"
print(f"Location at {point_a}: {locations[point_a]}")

### 2. Queues: Double-Ended efficiency (deque)
task_queue = deque(["Email Client", "Update Server"])
task_queue.append("Backup Data")
first_task = task_queue.popleft()
print(f"\nFinished: {first_task}")
print(f"Remaining in Queue: {list(task_queue)}")

### 3. Heaps: The Priority Machine (Min-Heap)
grades = [88, 95, 70, 100, 82]
heapq.heapify(grades)
print(f"\nLowest Grade (Min-Heap): {heapq.heappop(grades)}")

### 4. Max-Heap Workaround
max_heap = []
scores = [10, 50, 20]
for s in scores:
    heapq.heappush(max_heap, -s)
top_score = -heapq.heappop(max_heap)
print(f"Highest Score (Max-Heap): {top_score}")
```

Pro-Tip: Never use `list.pop(0)` for a queue. It forces Python to shift every other element in the list one spot to the left, which is $O(n)$. Always use `collections.deque` for $O(1)$ performance.

---

# The Bracket Breakdown: ( ), [ ], and { }

1. Square Brackets `[]` (Lists): Used for ordered collections.

2. Parentheses `()` (Tuples & Functions): For immutable tuples and function calls.

3. Curly Braces `{}` (Dicts & Sets): For mappings and unique collections.

```python
my_list = [1, 2, 3]
my_list.append(4)

my_tuple = (10, 20)
print("Hello!")

my_dict = {"name": "Alice", "age": 25}
my_set = {1, 2, 2, 3}
```

---

## Section 4: Functions and Modules
Define and call functions with parameters and return values, explore built-in functions, and import standard library modules.

```python
def greet(name):
    """A simple greeting function"""
    return f"Hello, {name}!"

def add(a, b):
    """Add two numbers"""
    return a + b

def multiply(x, y=2):
    """Multiply two numbers with a default parameter"""
    return x * y

print(greet("Alice"))
print(f"5 + 3 = {add(5, 3)}")
print(f"4 * 3 = {multiply(4, 3)}")
print(f"4 * 2 (default) = {multiply(4)}")
```

```python
numbers = [10, 5, 20, 3, 15]
print(f"List: {numbers}")
print(f"Sum: {sum(numbers)}")
print(f"Length: {len(numbers)}")
print(f"Maximum: {max(numbers)}")
print(f"Minimum: {min(numbers)}")
print(f"Sorted: {sorted(numbers)}")

import math
import datetime
print(f"\nMath module - sqrt(16): {math.sqrt(16)}")
print(f"Math module - pi: {math.pi}")
print(f"Current date and time: {datetime.datetime.now()}")
```

---

## Section 5: Working with Lists and Dictionaries

```python
# Working with Lists
my_list = [1, 2, 3, 4, 5]
print(f"Original list: {my_list}")
print(f"First element: {my_list[0]}")
print(f"Last element: {my_list[-1]}")
print(f"Slice [1:3]: {my_list[1:3]}")
print(f"Every second element: {my_list[::2]}")
my_list.append(6)
my_list.insert(0, 0)
my_list.remove(3)
popped = my_list.pop()
print(f"After pop(): {my_list}, popped value: {popped}")
squares = [x**2 for x in range(5)]
print(f"Squares of 0-4: {squares}")

# Working with Dictionaries
person = {"name": "John", "age": 30, "city": "New York", "email": "john@example.com"}
print(f"Dictionary: {person}")
print(f"Country (with default): {person.get('country', 'Unknown')}")
person['age'] = 31
person['occupation'] = 'Engineer'
for key, value in person.items():
    print(f"  {key}: {value}")
print(f"Keys: {list(person.keys())}")
print(f"Values: {list(person.values())}")
```

---

## Section 6: File Input and Output

```python
# Writing to a file
filename = "sample.txt"
with open(filename, 'w') as file:
    file.write("Hello, Python!\n")
    file.write("This is a sample file.\n")
    file.write("File I/O is easy!\n")

print(f"File '{filename}' created successfully.")

# Reading from a file
with open(filename, 'r') as file:
    content = file.read()
    print(content)

# Reading line by line
with open(filename, 'r') as file:
    for line in file:
        print(f"  {line.strip()}")

# Appending to a file
with open(filename, 'a') as file:
    file.write("This line was appended.\n")
print(f"\nLine appended to '{filename}'.")
```

---

## Section 7: Error Handling and Exceptions

```python
print("Example 1: ValueError")
try:
    num = int("not_a_number")
except ValueError:
    print("  Error: Could not convert string to integer")

print("\nExample 2: ZeroDivisionError")
try:
    result = 10 / 0
except ZeroDivisionError:
    print("  Error: Cannot divide by zero")

print("\nExample 3: IndexError")
try:
    my_list = [1, 2, 3]
    value = my_list[10]
except IndexError:
    print("  Error: Index out of range")

print("\nExample 4: Multiple exceptions")
def safe_divide(a, b):
    try:
        result = int(a) / int(b)
        return result
    except ValueError:
        print("  Error: Invalid input for conversion to integer")
    except ZeroDivisionError:
        print("  Error: Cannot divide by zero")
    finally:
        print("  Safe divide function completed")

safe_divide(10, 2)
safe_divide(10, 0)
safe_divide("ten", 2)
```

---

## Section 8: Object-Oriented Programming Basics

```python
# Define a class
class Dog:
    """A simple Dog class"""
    species = "Canis familiaris"
    def __init__(self, name, age):
        self.name = name
        self.age = age
    def bark(self):
        return f"{self.name} says: Woof!"
    def get_info(self):
        return f"{self.name} is {self.age} years old"

dog1 = Dog("Buddy", 3)
dog2 = Dog("Max", 5)
print(dog1.get_info())
print(dog2.get_info())
print(dog1.bark())
print(dog2.bark())
print(Dog.species)
```

```python
# Inheritance
class Animal:
    def __init__(self, name):
        self.name = name
    def speak(self):
        return f"{self.name} makes a sound"

class Cat(Animal):
    def speak(self):
        return f"{self.name} says: Meow!"

class Bird(Animal):
    def speak(self):
        return f"{self.name} says: Tweet!"

cat = Cat("Whiskers")
bird = Bird("Tweety")
print(cat.speak())
print(bird.speak())

# Encapsulation example
class BankAccount:
    def __init__(self, balance=0):
        self.__balance = balance
    def deposit(self, amount):
        if amount > 0:
            self.__balance += amount
            return f"Deposited ${amount}. New balance: ${self.__balance}"
        return "Invalid amount"
    def withdraw(self, amount):
        if amount > 0 and amount <= self.__balance:
            self.__balance -= amount
            return f"Withdrew ${amount}. New balance: ${self.__balance}"
        return "Invalid amount or insufficient funds"
    def get_balance(self):
        return f"Current balance: ${self.__balance}"

account = BankAccount(1000)
print(account.get_balance())
print(account.deposit(500))
print(account.withdraw(200))
print(account.get_balance())
```

---

## Conclusion
Congratulations! You've completed the Python fundamentals course. This document covered the same topics as the original notebook with cleaned Markdown and fenced code blocks for easy reading and copying.

- ✅ Python data types and basic operations
- ✅ Control flow with loops and conditionals
- ✅ Functions and modules
- ✅ Working with lists and dictionaries
- ✅ File I/O operations
- ✅ Error handling and exceptions
- ✅ Object-oriented programming basics

Practice these concepts by working on small projects and gradually increase complexity. Happy coding!
