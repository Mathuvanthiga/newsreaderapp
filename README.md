# 📰 News Reader App

A modern Android News Reader application developed using **Kotlin** and **Firebase**. The app allows users to authenticate securely, fetch news articles from Firestore, and browse them through a smooth swipe-based interface.

---

## 📱 Features

- 🔐 Firebase Authentication (Login & Registration)
- 📰 Read news articles stored in Firebase Firestore
- 📖 Swipe between articles using ViewPager2
- 🖼️ News image loading with Glide
- 🎨 Material Design UI
- 📋 RecyclerView-based news listing
- 🔗 View Binding for safer UI handling
- 💾 Cloud-based data storage using Firestore

---

## 🏗️ Tech Stack

| Technology | Usage |
|------------|--------|
| Kotlin | Android Development |
| Android Studio | IDE |
| Firebase Authentication | User Login & Signup |
| Firebase Firestore | News Database |
| RecyclerView | Display News Content |
| ViewPager2 | Swipe News Articles |
| Glide | Image Loading |
| Material Design | UI Components |
| View Binding | UI Binding |
| CardView | News Card Layout |

---

## 📂 Project Structure

```text
NewsReader
│
├── activities
│   ├── NewsDetailsActivity.kt
│   ├── AddNewsActivity.kt
│   └── MainActivity.kt
│
├── adapters
│   └── NewsAdapter.kt
│
├── models
│   └── News.kt
│
├── layouts
│   ├── activity_add_news.xml
│   ├── activity_news_details.xml
│   ├── activity_main.xml
│   └── item_news.xml
│
└── firebase
```

---

## 🔧 Dependencies

### AndroidX

```gradle
implementation("androidx.core:core-ktx:1.16.0")
implementation("androidx.appcompat:appcompat:1.7.1")
implementation("com.google.android.material:material:1.12.0")
```

### RecyclerView & ViewPager2

```gradle
implementation("androidx.recyclerview:recyclerview:1.4.0")
implementation("androidx.viewpager2:viewpager2:1.1.0")
```

### Firebase

```gradle
implementation(platform("com.google.firebase:firebase-bom:34.2.0"))
implementation("com.google.firebase:firebase-auth")
implementation("com.google.firebase:firebase-firestore")
```

### Glide

```gradle
implementation("com.github.bumptech.glide:glide:4.16.0")
```

### CardView

```gradle
implementation("androidx.cardview:cardview:1.0.0")
```

---

## ⚙️ Build Configuration

```gradle
compileSdk = 36
minSdk = 24
targetSdk = 36

Java Version = 17
Kotlin JVM Target = 17

viewBinding = true
```

---

## 🔥 Firebase Setup

### 1. Create Firebase Project

Create a project in Firebase Console.

### 2. Add Android App

Package Name:

```text
com.example.newsreader
```

### 3. Download Configuration File

Download:

```text
google-services.json
```

Place it inside:

```text
app/google-services.json
```

### 4. Enable Services

- Firebase Authentication
- Firebase Firestore Database

---

## 🚀 Installation

Clone the repository:

```bash
git clone https://github.com/yourusername/news-reader-app.git
```

Open the project in Android Studio.

Sync Gradle files.

Run the application on an emulator or physical device.

---

## 📸 Screenshots

![WhatsApp Image 2026-06-06 at 10.23.02 AM.jpeg](../../Downloads/WhatsApp%20Image%202026-06-06%20at%2010.23.02%20AM.jpeg)
![WhatsApp Image 2026-06-06 at 10.23.01 AM (1).jpeg](../../Downloads/WhatsApp%20Image%202026-06-06%20at%2010.23.01%20AM%20%281%29.jpeg)
![WhatsApp Image 2026-06-06 at 10.23.01 AM.jpeg](../../Downloads/WhatsApp%20Image%202026-06-06%20at%2010.23.01%20AM.jpeg)



## 🔄 Application Flow

```text
User Login/Register
        │
        ▼
Firebase Authentication
        │
        ▼
Fetch News from Firestore
        │
        ▼
RecyclerView/ViewPager2
        │
        ▼
Display News Articles
```

---

## 🌟 Future Enhancements

- News Categories
- Search News
- Bookmark Articles
- Dark Mode
- Push Notifications
- Offline Reading
- News Sharing

---

## 👨‍💻 Author

**S.V.Mathuvanthiga,M.Ramya,K.Pandi Selvi **

Android Developer | Kotlin | Firebase

---

## 📄 License

This project is created for educational and learning purposes.

⭐ Star this repository if you found it useful.