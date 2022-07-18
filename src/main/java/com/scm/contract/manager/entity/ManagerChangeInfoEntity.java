package com.scm.contract.manager.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_cntrt_chg_info", schema="tcms")
@Data // @Getter/@Setter, @ToString 등 생성
public class ManagerChangeInfoEntity {
    @Id
    @Column(name="cntrt_id")
    private String cntrtId; //계약 ID
    @Column(name="seq_no")
    private String seqNo; // 일련번호
    @Column(name="pre_actor_id")
    private String preActorId; // 이전 계약담당자 ID
    @Column(name="aft_actor_id")
    private String aftActorId; // 이후 계약담당자 ID
    @Column(name="valid_date")
    private String validDate; // 유효 시작일
    @Column(name="reason_desc")
    private String reasonDesc; // 변경사유 코멘트
    @Column(name="cmpt_yn")
    private String cmptYn; // 확정 여부
    @Column(name="del_yn")
    private String delYn;
    @Column(name="ins_date")
    private String insDate;
    @Column(name="ins_time")
    private String insTime;
    @Column(name="ins_person_id")
    private String insPersonId;
    @Column(name="upd_date")
    private String updDate;
    @Column(name="upd_time")
    private String updTime;
    @Column(name="upd_person_id")
    private String updPersonId;

}
