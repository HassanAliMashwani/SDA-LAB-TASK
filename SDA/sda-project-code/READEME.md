
Music Recommendation System
This is a simple music recommendation system that generates personalized song suggestions based on a user's preferences, such as liked genres and feedback (like/dislike). It simulates the process of recommending songs and updating the recommendations based on user feedback.

Project Overview
The system consists of several classes that work together to simulate music recommendations:

User: Represents a user's profile with attributes like preferred genres, liked songs, and disliked songs.
Song: Represents a song entity with attributes like song ID, title, artist, and genre.
RecommendationEngine: Contains the logic to generate song recommendations based on user preferences and feedback.
MusicRecommendationSystem (Main): The main class that simulates the user's interaction with the system and shows how recommendations change based on feedback.
Features
User Profile: Store a user's name, preferred genres, liked songs, and disliked songs.
Song Recommendations: Recommend songs based on the user's liked genres and previously liked songs.
Feedback Mechanism: Users can like or dislike songs, and the system will update recommendations accordingly.
Personalized Experience: Songs that a user has already liked or disliked are not recommended again.
Prerequisites
Java 8 or later is required to run this program.
How It Works
User Creation: A user profile is created, and the user’s preferred genres are set.
Song Database: A list of songs is defined, each with a unique ID, title, artist, and genre.
Initial Recommendations: The system generates song recommendations based on the user’s preferred genres.
User Feedback: The user provides feedback by liking or disliking songs.
Updated Recommendations: The system updates the list of recommended songs, removing songs the user has liked or disliked.
Sample Scenario
User Profile
Name: Hassan Ali Mashwani
Preferred Genres: Pop, Lo-Fi
Liked Songs: None yet
Disliked Songs: None yet
Step 1: Initial Recommendations
Hassan logs into the system, which fetches his preferences for Pop and Lo-Fi genres. The system recommends the following songs:

Morning Breeze by Lo-Fi Beats (Lo-Fi)
Sunshine Pop by Pop Hits (Pop)
Night Chill by Chillwave (Lo-Fi)
Step 2: User Feedback
Hassan listens to the recommendations and provides feedback:

Likes "Morning Breeze" (ID: 1).
Dislikes "Night Chill" (ID: 3).
Step 3: Updated Recommendations
Based on the feedback, the system removes "Morning Breeze" (liked) and "Night Chill" (disliked) from the recommendations. The updated list for Hassan is:

Sunshine Pop by Pop Hits (Pop)
Final Outcome
Hassan’s personalized recommendations are now filtered based on his feedback. Songs that he already liked or disliked are no longer recommended, ensuring a more tailored experience with each interaction.
