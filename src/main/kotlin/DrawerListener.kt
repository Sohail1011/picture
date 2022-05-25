interface DrawerListener {
    fun DrawingStarted()
    fun Completed(picture: String)
    fun onProgress(level: Double)
}