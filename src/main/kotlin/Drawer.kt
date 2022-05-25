class Drawer {
    var drawerListener: DrawerListener? = null

    fun PictureProgress(picture: String) {
        drawerListener?.DrawingStarted()
        for (i in 1..10) {
            Thread.sleep(100)
            drawerListener?.onProgress(i * 10.0)
        }
        drawerListener?.Completed(picture)
    }
}