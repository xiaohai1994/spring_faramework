package com.zhouyu.conditionlStudy;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

@Component
public class conditionalStdyu  implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {


		if (metadata.isAnnotated(Component.class.getName())) {
			return metadata.getAnnotations().isDirectlyPresent(Component.class);
		}


		return false;
	}
}
