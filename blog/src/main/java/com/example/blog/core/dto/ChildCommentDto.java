package com.example.blog.core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/6/13
 * \* Time: 16:07
 * \* Description:
 * \
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChildCommentDto implements Serializable {

    private static final long serialVersionUID = 5061212992497947120L;

    private Long articleId;
    private Long parentId;
}
