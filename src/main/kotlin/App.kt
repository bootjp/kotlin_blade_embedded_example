
import com.blade.Blade
import com.blade.mvc.handler.RouteHandler
import com.blade.mvc.http.Request
import com.blade.mvc.http.Response


fun main(args: Array<String>) {

    val server = Blade.me()
    server.apply {
        get("hello", HelloResponse)
    }
    server.start()
}


object HelloResponse : RouteHandler {
    /**
     * Route handler
     *
     * @param request  current thread Request instance
     * @param response current thread Response instance
     */
    override fun handle(request: Request, response: Response) {
        response.body("Hello")
    }

}
