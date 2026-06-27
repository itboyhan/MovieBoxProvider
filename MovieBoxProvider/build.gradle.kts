// use an integer for version numbers
version = 26
android {
    buildFeatures {
        buildConfig = true
    }
}
dependencies {
    val cloudstream by configurations
    implementation("androidx.appcompat:appcompat:1.7.1")
    implementation("com.google.android.material:material:1.14.0")
    cloudstream("com.lagradost:cloudstream3:pre-release")
}
cloudstream {
    language = "hi"
    description = "Multi Language Movies and Series Provider"
    authors = listOf("NivinCNC,Phisher98")
    status = 1
    tvTypes = listOf("Movie", "TvSeries")
    requiresResources = true
    iconUrl = "https://github.com/NivinCNC/CNCVerse-Cloud-Stream-Extension/raw/refs/heads/master/MovieBoxProvider/icon.png"
    isCrossPlatform = false
}
