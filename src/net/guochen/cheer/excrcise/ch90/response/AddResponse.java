package net.guochen.cheer.excrcise.ch90.response;

import net.guochen.cheer.excrcise.ch90.TaiShan;
import net.guochen.cheer.excrcise.ch90.define.Request;
import net.guochen.cheer.excrcise.ch90.define.Response;
import net.guochen.cheer.excrcise.ch90.request.AddRequest;

public  class AddResponse implements Response {

	@Override
	public void render(Request request) {
		AddRequest addRequest = (AddRequest) request;
		TaiShan.data.add(addRequest.getFill());
		System.out.println("学生信息增加成功！");
		TaiShan.commandMap.get(TaiShan.DEFAULT_COMMAND).handle();
	}

}
