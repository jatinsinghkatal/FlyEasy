## FlyEasy

FlyEasy is a flight booking application developed in Java that provides users with a seamless experience for searching, booking, and printing flight tickets. The application integrates Firebase for authentication and data storage, ensuring secure sign-in and real-time flight data management.

---

**Table of Contents**

- Features
- Screenshots
- Getting Started
- Technologies Used

---

**Features**

- User authentication and registration using Firebase
- Intuitive login and signup interface
- Search flights by selecting source, destination, departure date, passengers, and seat class
- Real-time fetching of flight details from Firebase storage
- Interactive seat selection for chosen flights
- Ticket generation after booking confirmation

---

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Gradle or Maven (depending on your build setup)
- Firebase account for backend setup

### Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/jatinsinghkatal/FlyEasy.git
   cd FlyEasy
   ```

2. **Configure Firebase:**
   - Set up a Firebase project.
   - Add your Firebase configuration (credentials, database URL, etc.) to the project as required.

3. **Build the project:**
   ```bash
   ./gradlew build
   ```
   _or, if using Maven:_
   ```bash
   mvn clean install
   ```

---

## Technologies Used

- Java
- Firebase Authentication & Realtime Database
- Gradle/Maven (build tools)
- JavaFX/Swing (for GUI, specify as per your implementation)

---

## Screenshots

> - Login/Signup Page
![WhatsApp Image 2025-05-02 at 19 31 00_75b0301e](https://github.com/user-attachments/assets/c2d590ea-d051-40fd-b67f-188863cc52bb)

> - Home/Search Page
![WhatsApp Image 2025-05-02 at 19 30 53_c4fc1e9c](https://github.com/user-attachments/assets/cfb6a3ea-b227-444d-b689-5482ae4f930d)

> - Flight Results Page
![WhatsApp Image 2025-05-02 at 19 30 54_677ae18d](https://github.com/user-attachments/assets/d3b94e95-ad3a-4d92-8979-34ce10913b5b)

> - Seat Selection Page
![WhatsApp Image 2025-05-02 at 19 30 54_6a326879](https://github.com/user-attachments/assets/8999a7e6-36f2-4dcd-b511-6b56c7d8d86b)

> - Ticket Print Page
![WhatsApp Image 2025-05-02 at 19 31 01_4c75f165](https://github.com/user-attachments/assets/87511cf2-362f-4088-852e-63bfad25619e)
