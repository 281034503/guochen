package net.guochen.cheer.excrcise.ch90.request;

import net.guochen.cheer.excrcise.ch90.TaiShan;
import net.guochen.cheer.excrcise.ch90.define.Request;

public class ViewRequest implements Request {

	@Override
	public boolean input() {
		if(TaiShan.data.size()>0){
			return true;
		}else{
			System.out.println("��ǰû��ѧ����¼����������ѧ����Ϣ��");
			return false;
		}
	}

}
