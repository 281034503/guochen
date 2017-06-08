package net.guochen.cheer.excrcise.ch90.define;

import net.guochen.cheer.excrcise.ch90.TaiShan;
import net.guochen.cheer.excrcise.ch90.request.AddRequest;
import net.guochen.cheer.excrcise.ch90.request.ViewRequest;
import net.guochen.cheer.excrcise.ch90.response.AddResponse;
import net.guochen.cheer.excrcise.ch90.response.ViewResponse;

public class Processor {
	
	private Request request;
	private Response response;
	
	public Processor(
			Request request, Response response){
		this.request = request;
		this.response = response;
	}
	
	
	public Processor(AddRequest addRequest, AddResponse addResponse) {
		
	}


	public Processor(ViewRequest request, ViewResponse response) {
		
	}


	public void handle(){
		if(request.input()){
			response.render(request);
		}else{
			TaiShan.commandMap.get(TaiShan.DEFAULT_COMMAND).handle();
		}
	}
}	