fun main() {
    val drawer = Drawer()
    drawer.drawerListener = object : DrawerListener {
        override fun DrawingStarted() {
            println("The picture is drawwing")
        }

        override fun Completed(picture: String) {
            println("$picture is completed")
        }

        override fun onProgress(level: Double) {
            println("$level% progress")
        }

    }
    drawer.PictureProgress("Shelly.jpg")
}