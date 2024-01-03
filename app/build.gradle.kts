plugins {
    id("com.android.application")
}

android {
    namespace = "com.su.iot.crowdsensing"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.su.iot.crowdsensing"
        minSdk = 33
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    lint {
        baseline = file("lint-baseline.xml")
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
}

dependencies {

    implementation("org.altbeacon:android-beacon-library:2.19.4")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("pl.droidsonroids.gif:android-gif-drawable:1.2.22")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.squareup.okhttp3:okhttp:4.10.0")
    implementation("org.slf4j:slf4j-api:2.0.7")
    implementation("com.github.tony19:logback-android:2.0.0")
    implementation("org.eclipse.paho:org.eclipse.paho.android.service:1.1.1")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}