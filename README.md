# Understanding SharedPrefences - Kotlin


If you have a `relatively small collection of key-values` that you'd like to save, you can use the SharedPreferences APIs. A SharedPreferences object points to a file containing key-value pairs and provides simple methods to read and write them. Each SharedPreferences file is managed by the framework and can be private or shared.

> [!NOTE]
> To get more information [SharedPrefences](https://developer.android.com/training/data-storage/shared-preferences).

## About App

A very simple age save and delete app.

- After the user enters her/his age and if she/he kills the application, the age she/he entered will be saved as local data.
- If she/he opens the app again he will encounter the recorded age.
- When the Delete button is pressed, the recorded age will be deleted.

## App Images

### - First look at the app
![firstLook](https://github.com/aydozy/KotlinStoringData/assets/104395137/7b42ddd6-fee6-4c26-80c6-25db8d48a64a)

### - Storing Age
![storingAge](https://github.com/aydozy/KotlinStoringData/assets/104395137/836fb3f5-675b-4b96-9459-f3508ff8e592)

## App Video
https://github.com/aydozy/KotlinStoringData/assets/104395137/884ecfe9-cfad-4c76-9462-1fca8481c16f


