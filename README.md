# 🎵 Music Streaming Platform with Playlist & Discovery

> A Spotify-inspired full-stack web application where users can stream music, create playlists, discover new songs, and manage their personalized music library.

---

# 📌 Project Overview

The Music Streaming Platform is designed to provide a simple and user-friendly music experience. Users can browse songs, search by artist or genre, create playlists, like favorite songs, and track their listening history. Administrators can manage users, songs, artists, albums, and music categories.

---

# ❗ Problem Statement

Users often need a single platform to discover music, organize playlists, and manage favorite songs. Administrators also require an efficient system to maintain music content and user data. This project solves both problems through a centralized web application.

---

# 💡 Proposed Solution

Develop a web-based music streaming platform using Java Spring Boot and MySQL that provides music streaming, playlist management, personalized discovery, and administrative control.

---

# ✨ Key Features

## 👤 User Features

- User Registration & Login
- Secure Authentication
- Browse All Songs
- Search by Song Name
- Search by Artist
- Search by Album
- Search by Genre
- Stream Music
- Create Unlimited Playlists
- Edit Playlist Name
- Delete Playlists
- Add Songs to Playlist
- Remove Songs from Playlist
- Like / Unlike Songs
- Recently Played History
- Favorite Songs Collection
- Favorite Artists
- User Profile Management
- Responsive Music Interface

## 🎧 Music Discovery

- Trending Songs
- New Releases
- Top Artists
- Genre-Based Discovery
- Mood Categories (Happy, Chill, Workout, Focus)
- Weekly Top Picks
- Recommended Albums

## 🛠️ Admin Features

- Admin Dashboard
- Manage Users
- Add Songs
- Update Song Details
- Delete Songs
- Manage Artists
- Manage Albums
- Manage Genres
- View Total Users
- View Total Songs
- View Popular Songs
- Music Library Management

---

# 🧠 AI Features (Future Enhancement)

- AI Music Recommendation Engine
- Automatic Playlist Generation
- Mood-Based Song Recommendation
- Listening Pattern Analysis
- Personalized Daily Mix
- Similar Artist Recommendation

---

# 🏗️ System Architecture

```text
User / Admin
       │
       ▼
Frontend (HTML, CSS, JavaScript)
       │
       ▼
REST API
       │
       ▼
Java Spring Boot
 ├── Controller
 ├── Service
 └── Repository
       │
       ▼
Spring Data JPA
       │
       ▼
MySQL Database
```

---

# 🗄️ Database Entities

| Entity | Purpose |
|---------|---------|
| User | Stores user details |
| Artist | Artist information |
| Album | Album details |
| Song | Song metadata |
| Playlist | User playlists |
| PlaylistSong | Playlist–Song mapping |
| Like | Favorite songs |
| ListeningHistory | Recently played songs |

---

# 🔄 Application Workflow

1. User registers or logs in.
2. Browse or search songs.
3. Stream music.
4. Like favorite songs.
5. Create and manage playlists.
6. Listening history is saved.
7. Admin manages music data.

---

# 🛠️ Technology Stack

| Layer | Technology |
|--------|------------|
| Frontend | HTML, CSS, JavaScript |
| Backend | Java Spring Boot |
| Database | MySQL |
| ORM | Spring Data JPA / Hibernate |
| API | REST API |
| IDE | VS Code |
| Version Control | Git & GitHub |

---

# 📁 Project Structure

```text
Music-Streaming-Platform/
│
├── frontend/
│   ├── index.html
│   ├── login.html
│   ├── register.html
│   ├── playlist.html
│   ├── profile.html
│   ├── style.css
│   └── script.js
│
├── backend/
│   ├── controller/
│   ├── service/
│   ├── repository/
│   ├── model/
│   └── application.properties
│
├── database/
│   └── music_streaming.sql
│
└── README.md
```

---

# 🎯 Minimum Viable Product (MVP)

- User Authentication
- Browse & Search Songs
- Music Player
- Playlist Management
- Like Songs
- Admin CRUD Operations
- MySQL Database Integration

---

# 🚀 Future Scope

- AI Personalized Recommendations
- Smart Playlist Generator
- Cloud Deployment
- Mobile Application
- Social Music Sharing
- Offline Listening Support

---

# 👩‍💻 Author

**Capstone Project — Music Streaming Platform with Playlist & Discovery**

Developed using **Java Spring Boot, MySQL, HTML, CSS, and JavaScript**.