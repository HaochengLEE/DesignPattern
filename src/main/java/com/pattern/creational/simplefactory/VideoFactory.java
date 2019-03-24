package com.pattern.creational.simplefactory;

/**
 * @author lihaocheng
 * @create 2019-03-24 14:03
 **/

public class VideoFactory {
    public Video getVideo(String name){
        if("java".equalsIgnoreCase(name)){
            return new JavaVideo();
        }
        else if("python".equalsIgnoreCase(name)){
            return new PythonVideo();
        }else
            return null;

    }

    public Video getVideo2(Class c){
        Video video=null;
        try {
            video= (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }

}
