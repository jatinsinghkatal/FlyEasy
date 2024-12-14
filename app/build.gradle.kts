plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.uilover.project1992"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.uilover.project1992"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"


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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    implementation (libs.glide)
    implementation (libs.chip.navigation.bar)
//    implementation(libs.firebase.database)
    implementation(libs.activity)
    implementation(libs.firebase.database)
    implementation(libs.firebase.auth)

}