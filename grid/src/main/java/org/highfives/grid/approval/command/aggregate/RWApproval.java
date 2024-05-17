package org.highfives.grid.approval.command.aggregate;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Entity
@Table(name = "rw_approval")
public class RWApproval {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "start_time")
    private String startTime;

    @Column(name = "end_time")
    private String endTime;

    @Column(name = "content")
    private String content;

    @Column(name = "approval_status")
    @Enumerated(EnumType.STRING)
    private ApprovalStatus approvalStatus;

    @Column(name = "write_time")
    private String writeTime;

    @Column(name = "cancel_yn")
    @Enumerated(EnumType.STRING)
    private YN cancelYN;

    @Column(name = "cancel_document_id")
    private int cancelDocId;

    @Column(name = "requester_id")
    private int requesterId;

    @Column(name = "origin_name")
    private String originName;

    @Column(name = "rename_name")
    private String renameName;

    @Column(name = "path")
    private String path;

    @Builder
    public RWApproval(String startTime, String endTime, String content, String writeTime, int cancelDocId, int requesterId, String originName, String renameName, String path) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.content = content;
        this.approvalStatus = ApprovalStatus.N;
        this.writeTime = writeTime;
        this.cancelYN = YN.N;
        this.cancelDocId = cancelDocId;
        this.requesterId = requesterId;
        this.originName = originName;
        this.renameName = renameName;
        this.path = path;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setOriginName(String originName) {
        this.originName = originName;
    }

    public void setRenameName(String renameName) {
        this.renameName = renameName;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
