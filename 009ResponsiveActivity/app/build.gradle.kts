plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.a009responsiveactivity"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.a009responsiveactivity"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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

    implementation(libs.appcompat) // Referencia a la dependencia de appcompat
    implementation(libs.material)  // Referencia a la dependencia de material
    implementation(libs.recyclerview) // Referencia a la dependencia de recyclerview
    implementation(libs.constraintlayout) // Referencia a la dependencia de constraintlayout
    implementation(libs.lifecycle.livedata.ktx) // Referencia a la dependencia de lifecycle-livedata-ktx
    implementation(libs.lifecycle.viewmodel.ktx) // Referencia a la dependencia de lifecycle-viewmodel-ktx
    implementation(libs.navigation.fragment) // Referencia a la dependencia de navigation-fragment
    implementation(libs.navigation.ui)
    implementation(libs.legacy.support.v4) // Referencia a la dependencia de navigation-ui
    testImplementation(libs.junit) // Referencia a la dependencia de junit
    androidTestImplementation(libs.ext.junit) // Referencia a la dependencia de ext-junit
    androidTestImplementation(libs.espresso.core) // Referencia a la dependencia de espresso-core
}