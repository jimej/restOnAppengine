package com.rest.appengine.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.rest.appengine.common.Restaurant;
import java.util.List;
import java.util.ArrayList;

@Controller
@RequestMapping("/data")
public class DataController {
	@RequestMapping(value="/restaurants", method = RequestMethod.GET, produces="application/json")
	@ResponseBody
	public List<Restaurant> getRestaurants() {
		//connecting to google spreatsheets requires service API key
		//using in-memory data for now
        List<Restaurant> list = new ArrayList<Restaurant>();
        list.add(new Restaurant().setAddress("1435 S State St, Salt Lake City, UT 84115").setId(1).setName("Thai Siam Restaurant").setRating(4.0).setStyle("Thai").setLat(40.738932).setLon(-111.887755).setPhone("(801) 474-3322"));
        list.add(new Restaurant().setAddress("224 S 1300 E, Salt Lake City, UT 84102").setId(2).setRating(4.1).setName("Aristo's").setStyle("Greek").setLat(40.764176).setLon(-111.854324).setPhone("(801) 581-0888"));
        list.add(new Restaurant().setAddress("15 S Temple, Salt Lake City, UT 84150").setId(3).setName("The Garden Restaurant").setRating(3.7).setStyle("American").setLat(40.769638).setLon(-111.890591).setPhone("(801) 539-3170"));
        list.add(new Restaurant().setAddress("60 W Market St, Salt Lake City, UT 84101").setId(4).setName("New Yorker Restaurant").setRating(4.3).setStyle("American").setLat(40.761884).setLon(-111.892792).setPhone("(801) 363-0166"));
        list.add(new Restaurant().setAddress("278 E 900 S, Salt Lake City, UT 84111").setId(5).setName("Chanon Thai Cafe").setRating(4.5).setStyle("Thai").setLat(40.74947).setLon(-111.882881).setPhone("(801) 532-1177"));
        list.add(new Restaurant().setAddress("878 S 900 E, Salt Lake City, UT 84102").setId(6).setName("Pago").setRating(4.1).setStyle("American").setLat(40.750179).setLon(-111.865685).setPhone("(xxx) xxx-xxxx"));
        list.add(new Restaurant().setAddress("454 E 300 S, Salt Lake City, UT 84111").setId(7).setName("Faustina").setRating(4.1).setStyle("American").setLat(40.762531).setLon(-111.877847).setPhone("(xxx) xxx-xxxx"));
        list.add(new Restaurant().setAddress("50 S Main St #168, Salt Lake City, UT 84101").setId(8).setName("Texas de Brazil").setRating(4.0).setStyle("Brazilian").setLat(40.768144).setLon(-111.8918).setPhone("(xxx) xxx-xxxx"));
        list.add(new Restaurant().setAddress("1080 E 1300 S, Salt Lake City, UT 84105").setId(9).setName("Kyoto Japanese Restaurant").setRating(4.4).setStyle("Japanese").setLat(40.741444).setLon(-111.859874).setPhone("(xxx) xxx-xxxx"));
        list.add(new Restaurant().setAddress("317 S Main St, Salt Lake City, UT 84111").setId(10).setName("Eva").setRating(4.1).setStyle("Mediterranean").setLat(40.762309).setLon(-111.89078).setPhone("(xxx) xxx-xxxx"));
        list.add(new Restaurant().setAddress("55 W 100 S, Salt Lake City, UT 84101").setId(11).setName("Caffe Molise").setRating(4.4).setStyle("Italian").setLat(40.766918).setLon(-111.893006).setPhone("(xxx) xxx-xxxx"));
        list.add(new Restaurant().setAddress("151 S 500 E, Salt Lake City, UT 84102").setId(12).setName("Oasis Cafe").setRating(4.2).setStyle("American").setLat(40.765813).setLon(-111.87628).setPhone("(xxx) xxx-xxxx"));
        
        return list;
	}
 
//	String message;
//	MappingJackson2HttpMessageConverter c;
// 
//	@RequestMapping(value="/{name}", method = RequestMethod.GET, produces="application/json")
//	@ResponseBody
//	public Employee getEmployee(@PathVariable String name, ModelMap model) {
//        Employee e = new Employee();
//        e.setName(name);
//        e.setId(2534); 
//        return e;
// 
//	}
	
 
}
