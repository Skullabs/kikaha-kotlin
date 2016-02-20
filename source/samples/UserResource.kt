package samples

import kikaha.urouting.api.GET
import kikaha.urouting.api.Path
import kikaha.urouting.api.QueryParam
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserResource {

	@GET
	@Path("test")
	fun sayHello( @QueryParam("name") name:String ):String {
		return "Hello $name"
	}
}
