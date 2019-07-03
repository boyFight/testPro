
package com.poly.nci.customer.utils;

import com.poly.nci.customer.vo.TransData;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class XstreamTool
{

	public XstreamTool()
	{
	}

	public static String toXml(Object model)
	{
		XStream xstream = new XStream(new DomDriver());
		String xml = xstream.toXML(model);
		return xml;
	}

	public static String toXml1(Object model)
	{
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("TransData", TransData.class);
		StringBuffer xml = new StringBuffer();
		xml.append("<?xml version=\"1.0\" encoding=\"GBK\"?>\n");
		xml.append(xstream.toXML(model));
		return xml.toString();
	}
	
	public static Object toObj(String xmlString)
	{
		XStream xs = new XStream(new DomDriver());
		Object ob = xs.fromXML(xmlString);
		System.out.println(ob);
		return ob;
	}

}
