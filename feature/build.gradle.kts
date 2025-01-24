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
        }
    }
}

dependencies {
    implementation(project(":base"))
}