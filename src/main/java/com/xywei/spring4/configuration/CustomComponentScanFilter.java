package com.xywei.spring4.configuration;

import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

/**
 * 自定义扫描策略
 * 
 * @author wodoo
 *
 */
public class CustomComponentScanFilter implements TypeFilter {

	/**
	 * @param metadataReader
	 *            当前正在扫描的类的信息
	 * @param metadataReaderFactory
	 *            能获取的任何类的信息
	 * 
	 */
	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		// 当前扫描类的注解信息
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		for (String type : annotationMetadata.getAnnotationTypes()) {
			System.out.println("annotation:>>>>>>>>>>>" + type);
		}
		// 当前扫描类的类信息
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		System.out.println("class:>>>>>>>>>>>" + classMetadata.getClassName());
		// 当前类资源，类路径下
		Resource resource = metadataReader.getResource();
		System.out.println("resource::>>>>>>>>>>>" + resource.getFilename());

		if(classMetadata.getClassName().contains("xywei")) {
			return true;
		}
		
		return false;
	}

}
