plugins {
    id("com.android.feature")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.fragmentsapp"
    compileSdk = 34

    defaultConfig {
        minSdk = 24
        targetSdk = 33
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(project(":base"))
    implementation("com.google.android.gms:play-services-instantapps:18.0.1")
}