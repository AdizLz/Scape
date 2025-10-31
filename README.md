# Spookathon

# 🚀 Story: The Binary Virus
## 🚪 Introduction (Room 1: The Locked Laboratory)

**Setting:** A room with flickering lights, soft warning sounds (alarms), and a large screen or sign displaying the logo of a corporation or a virus.

The Mission:

_"You have been locked inside the secure control center. A computer virus, codenamed 'The Binary', has taken over and is about to erase all vital data worldwide. You have $60$ minutes to disable the shutdown sequence. The door to the next control area (the 'Room 2') is sealed with a 3-digit numeric code, and the key is hidden within the first error log left by the virus."_
________________________________________

## 🧩 Puzzle 1: The Error Log (Opens Room 2)

_**Initial Clue:** On a whiteboard, a piece of paper, or a computer screen, the following message is clearly visible:

**CRITICAL ERROR LOG:** The access system requires the error key in decimal format. The virus has encrypted the key. You must convert the following data to decimal to obtain the access code:_

### **BINARY KEY: 011 001 110**

**Mechanics:**
1. Players must recognize that the key consists of three separate binary numbers.
2. They must convert each binary number to decimal.
   - 011 (Binary) - 3 (Decimal)
   - 001 (Binary) - 1 (Decimal)
   - 110 (Binary) - 6 (Decimal)
3. Solution: The code is **316**.

4. **Reward:** The code 316 opens a 3-digit combination lock or a digital keypad on the door to "Room 2".


## 🔍 Puzzle 2: The Frequencies (Opens Room 3)
**Setting (Room 2: The Server Storage)**
Once inside, they find various signs, boxes, or server mock-ups. In a corner, there is a table with audio equipment or a frequency diagram.

**The Clue:** Next to the door of the next room, there is a sign or note that reads:

_"Well done! The virus has replicated and has modified the audio frequencies to protect the next room. The access key is the sum of the critical frequencies. To find them, use the frequency diagram and convert the binary data."_

**The Task:** The "Frequency Diagram" is a list or drawing that labels three frequencies with binary codes.

**CRITICAL FREQUENCY DIAGRAM:**
1. Alpha Frequency: 10001
2. Beta Frequency: 1100
3. Gamma Frequency: 10101
   
**Mechanics:**
1. Players must convert the three binary frequencies to decimal.
- 10001 (Binary) - 17 (Decimal)
- 1100 (Binary) - 12 (Decimal)
- 10101 (Binary) - 21 (Decimal)

2. They must add the decimal results to get the final code.
- 17 + 12 + 21 = **50**

3. **Solution:** The code is 50.Reward: The number 50 opens a small box (simulating a switch) that contains a physical key for the door to "Room 3" or the final instruction.


## 🔓 Puzzle 3: The Final Sequence (The Exit)

**Setting (Room 3: The System Core)**

This is the final room. There is a timer (real or simulated) counting down the last few minutes and a control station or button console. The "Exit" door is visible.

**The Clue:** On the final control console, there is a message with the final instruction and a sequence of 4 binary codes.

**ATTENTION! DEACTIVATION CODE. TIME REMAINING**

To stop the virus, you must enter the 4 disinfection codes in the correct order. The correct order is from the lowest to the highest of their decimal conversions.

DISINFECTION CODES:
- A. 1110
- B. 1001
- C. 1011
- D. 1100

**Mechanics:**
1. Players convert each binary code to decimal:
- A. 1110 (Binary) - 14 (Decimal)
- B. 1001 (Binary) - 9 (Decimal)
- C. 1011 (Binary) - 11 (Decimal)
- D. 1100 (Binary) - 12 (Decimal)

2. Then, they must order the decimal results from lowest to highest to obtain the sequence of the binary numbers:
- 9 - 11 - 12 - 14
  
3. The final 4-digit code (or button sequence) will be the binary value in that order.

**Solution (The order of the binary codes):**
1. B (9)
2. C (11)
3. D (12)
4. A (14)

The final code sequence is: 1001 - 1011 - 1100 - 1110

Reward: Upon entering the correct sequence, the timer stops, a green light turns on, and the "Exit" door is unlocked.

## Project Structure

```
.
├── .git
├── .mvn
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── demo
│   │   │               ├── controller
│   │   │               ├── dto
│   │   │               ├── service
│   │   │               └── ScapeApplication.java
│   │   └── resources
│   │       └── application.properties
├── .gitattributes
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```


