plugins {
    id("com.android.instantapp")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.fragmentsapp.instantapp"
    compileSdk = 34
}

dependencies {
    implementation(project(":feature"))
    implementation(project(":base"))
}