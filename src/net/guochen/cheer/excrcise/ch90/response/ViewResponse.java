package net.guochen.cheer.excrcise.ch90.response;

import net.guochen.cheer.excrcise.ch90.TaiShan;
import net.guochen.cheer.excrcise.ch90.define.Request;
import net.guochen.cheer.excrcise.ch90.define.Response;
import net.guochen.cheer.excrcise.ch90.entity.Student;


public class ViewResponse implements Response {

	@Override
	public void render(Request request) {
		System.out.println("��ǰ�ܹ���" +TaiShan.data.size()+"��ѧ����¼");
		System.out.println("id\t\t\tname\t\tsex\t\tbirthday\t\theight\t\tweight");
		System.out.println("------------------------------------------------------------------------------------");
		for(int i=0;i<TaiShan.data.size();i++){
			Student student = TaiShan.data.get(i);
			System.out.println(student);
		}
		
	}

}
