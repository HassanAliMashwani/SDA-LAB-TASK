<div align="center">

# SDA-LAB-TASK

</div>

## LAB TASK 

## Music Recommendation System

This is a simple music recommendation system that generates personalized song suggestions based on a user's preferences, such as liked genres and feedback (like/dislike). It simulates the process of recommending songs and updating the recommendations based on user feedback.

## Project Overview
The system consists of several classes that work together to simulate music recommendations:

User: Represents a user's profile with attributes like preferred genres, liked songs, and disliked songs.<br>
Song: Represents a song entity with attributes like song ID, title, artist, and genre.<br>
RecommendationEngine: Contains the logic to generate song recommendations based on user preferences and feedback.<br>
MusicRecommendationSystem (Main): The main class that simulates the user's interaction with the system and shows how recommendations change based on feedback.<br>
## Features
User Profile: Store a user's name, preferred genres, liked songs, and disliked songs.<br>
Song Recommendations: Recommend songs based on the user's liked genres and previously liked songs.<br>
Feedback Mechanism: Users can like or dislike songs, and the system will update recommendations accordingly.<br>
Personalized Experience: Songs that a user has already liked or disliked are not recommended again.<br>
Prerequisites
Java 8 or later is required to run this program.<br>
## How It Works
User Creation: A user profile is created, and the user’s preferred genres are set.<br>
Song Database: A list of songs is defined, each with a unique ID, title, artist, and genre.<br>
Initial Recommendations: The system generates song recommendations based on the user’s preferred genres.<br>
User Feedback: The user provides feedback by liking or disliking songs.<br>
Updated Recommendations: The system updates the list of recommended songs, removing songs the user has liked or disliked.<br>
## Sample Scenario
User Profile
Name: Hassan Ali Mashwani<br>
Preferred Genres: Pop, Lo-Fi<br>
Liked Songs: None yet<br>
Disliked Songs: None yet<br>
Step 1: Initial Recommendations<br>
Hassan logs into the system, which fetches his preferences for Pop and Lo-Fi genres. The system recommends the following songs:<br>

Morning Breeze by Lo-Fi Beats (Lo-Fi)<br>
Sunshine Pop by Pop Hits (Pop)<br>
Night Chill by Chillwave (Lo-Fi)<br>
Step 2: User Feedback<br>
Hassan listens to the recommendations and provides feedback:<br>

Likes "Morning Breeze" (ID: 1).<br>
Dislikes "Night Chill" (ID: 3).<br>
Step 3: Updated Recommendations<br>
Based on the feedback, the system removes "Morning Breeze" (liked) and "Night Chill" (disliked) from the recommendations. The updated list for Hassan is:<br>

Sunshine Pop by Pop Hits (Pop)<br>
## Final Outcome
Hassan’s personalized recommendations are now filtered based on his feedback. Songs that he already liked or disliked are no longer recommended, ensuring a more tailored experience with each interaction.
