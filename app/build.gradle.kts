plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdkVersion(AppConfig.compileSdkVersion)

    defaultConfig {
        applicationId = AppConfig.applicationId
        minSdkVersion(AppConfig.minSdkVersion)
        targetSdkVersion(AppConfig.targetSdkVersion)
        versionCode(AppConfig.versionCode)
        versionName = AppConfig.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = AppConfig.jvmTarget
    }
}

dependencies {
    implementation(AppDependencies.kotlinStdlib)
    implementation(AppDependencies.kotlinCore)
    implementation(AppDependencies.appCompat)
    implementation(AppDependencies.materialDesign)
    implementation(AppDependencies.constraintLayout)
    testImplementation(AppDependencies.jUnit)
    androidTestImplementation(AppDependencies.extJunit)
    androidTestImplementation(AppDependencies.expresso)
}