package com.app.demo.repository;

import com.app.demo.entity.MemberPlaylist;
import com.app.demo.entity.enums.Emotion;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface MemberPlaylistRepository extends JpaRepository<MemberPlaylist, Long> {

    MemberPlaylist findByMemberIdAndPlaylistDate(Long memberId, LocalDate playlistDate);
    List<MemberPlaylist> findByMemberIdAndMemberEmotion(Long memberId, Emotion memberEmotion);
    List<MemberPlaylist> findByMemberId(Long memberId);
}
