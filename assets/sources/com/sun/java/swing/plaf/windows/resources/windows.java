<div class="blob-viewer" data-path="src/main/java/org/apache/commons/lang3/StringUtils.java" data-type="simple" data-url="/redhat/centos-stream/src/apache-commons-lang3/-/blob/c8s-stream-3.6/src/main/java/org/apache/commons/lang3/StringUtils.java?format=json&amp;viewer=simple" data-loaded="true"><div class="blob-viewer" data-path="src/main/java/org/apache/commons/lang3/StringUtils.java" data-type="simple">
<div class="file-content code js-syntax-highlight white" id="blob-content">
<div class="line-numbers">
<a class="file-line-num diff-line-num" data-line-number="1" href="#L1" id="L1">
1
</a>
<a class="file-line-num diff-line-num" data-line-number="2" href="#L2" id="L2">
2
</a>
<a class="file-line-num diff-line-num" data-line-number="3" href="#L3" id="L3">
3
</a>
<a class="file-line-num diff-line-num" data-line-number="4" href="#L4" id="L4">
4
</a>
<a class="file-line-num diff-line-num" data-line-number="5" href="#L5" id="L5">
5
</a>
<a class="file-line-num diff-line-num" data-line-number="6" href="#L6" id="L6">
6
</a>
<a class="file-line-num diff-line-num" data-line-number="7" href="#L7" id="L7">
7
</a>
<a class="file-line-num diff-line-num" data-line-number="8" href="#L8" id="L8">
8
</a>
<a class="file-line-num diff-line-num" data-line-number="9" href="#L9" id="L9">
9
</a>
<a class="file-line-num diff-line-num" data-line-number="10" href="#L10" id="L10">
10
</a>
<a class="file-line-num diff-line-num" data-line-number="11" href="#L11" id="L11">
11
</a>
<a class="file-line-num diff-line-num" data-line-number="12" href="#L12" id="L12">
12
</a>
<a class="file-line-num diff-line-num" data-line-number="13" href="#L13" id="L13">
13
</a>
<a class="file-line-num diff-line-num" data-line-number="14" href="#L14" id="L14">
14
</a>
<a class="file-line-num diff-line-num" data-line-number="15" href="#L15" id="L15">
15
</a>
<a class="file-line-num diff-line-num" data-line-number="16" href="#L16" id="L16">
16
</a>
<a class="file-line-num diff-line-num" data-line-number="17" href="#L17" id="L17">
17
</a>
<a class="file-line-num diff-line-num" data-line-number="18" href="#L18" id="L18">
18
</a>
<a class="file-line-num diff-line-num" data-line-number="19" href="#L19" id="L19">
19
</a>
<a class="file-line-num diff-line-num" data-line-number="20" href="#L20" id="L20">
20
</a>
<a class="file-line-num diff-line-num" data-line-number="21" href="#L21" id="L21">
21
</a>
<a class="file-line-num diff-line-num" data-line-number="22" href="#L22" id="L22">
22
</a>
<a class="file-line-num diff-line-num" data-line-number="23" href="#L23" id="L23">
23
</a>
<a class="file-line-num diff-line-num" data-line-number="24" href="#L24" id="L24">
24
</a>
<a class="file-line-num diff-line-num" data-line-number="25" href="#L25" id="L25">
25
</a>
<a class="file-line-num diff-line-num" data-line-number="26" href="#L26" id="L26">
26
</a>
<a class="file-line-num diff-line-num" data-line-number="27" href="#L27" id="L27">
27
</a>
<a class="file-line-num diff-line-num" data-line-number="28" href="#L28" id="L28">
28
</a>
<a class="file-line-num diff-line-num" data-line-number="29" href="#L29" id="L29">
29
</a>
<a class="file-line-num diff-line-num" data-line-number="30" href="#L30" id="L30">
30
</a>
<a class="file-line-num diff-line-num" data-line-number="31" href="#L31" id="L31">
31
</a>
<a class="file-line-num diff-line-num" data-line-number="32" href="#L32" id="L32">
32
</a>
<a class="file-line-num diff-line-num" data-line-number="33" href="#L33" id="L33">
33
</a>
<a class="file-line-num diff-line-num" data-line-number="34" href="#L34" id="L34">
34
</a>
<a class="file-line-num diff-line-num" data-line-number="35" href="#L35" id="L35">
35
</a>
<a class="file-line-num diff-line-num" data-line-number="36" href="#L36" id="L36">
36
</a>
<a class="file-line-num diff-line-num" data-line-number="37" href="#L37" id="L37">
37
</a>
</div>
<div class="blob-content" data-blob-id="01dd3290f8c8cbdeab0a2428d8b775a16a063bc5" data-path="src/main/java/org/apache/commons/lang3/StringUtils.java" data-qa-selector="file_content">
<pre class="code highlight"><code><span id="LC1" class="line" lang="java"><span class="kn">package</span> <span class="nn">com.sun.java.swing.plaf.windows.resources</span><span class="o">;</span></span>
<span id="LC2" class="line" lang="java"></span>
<span id="LC3" class="line" lang="java"><span class="kn">import</span> <span class="nn">java.util.ListResourceBundle</span><span class="o">;</span></span>
<span id="LC4" class="line" lang="java"></span>
<span id="LC5" class="line" lang="java"><span class="kd">public</span> <span class="kd">final</span> <span class="kd">class</span> <span class="nc">windows</span> <span class="kd">extends</span> <span class="nc">ListResourceBundle</span> <span class="o">{</span></span>
<span id="LC6" class="line" lang="java">    <span class="kd">protected</span> <span class="kd">final</span> <span class="nc">Object</span><span class="o">[][]</span> <span class="nf">getContents</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC7" class="line" lang="java">        <span class="k">return</span> <span class="k">new</span> <span class="nc">Object</span><span class="o">[][]</span> <span class="o">{</span></span>
<span id="LC8" class="line" lang="java">            <span class="o">{</span> <span class="s">"FileChooser.detailsViewActionLabel.textAndMnemonic"</span><span class="o">,</span> <span class="s">"Details"</span> <span class="o">},</span></span>
<span id="LC9" class="line" lang="java">            <span class="o">{</span> <span class="s">"FileChooser.detailsViewButtonAccessibleName"</span><span class="o">,</span> <span class="s">"Details"</span> <span class="o">},</span></span>
<span id="LC10" class="line" lang="java">            <span class="o">{</span> <span class="s">"FileChooser.detailsViewButtonToolTip.textAndMnemonic"</span><span class="o">,</span> <span class="s">"Details"</span> <span class="o">},</span></span>
<span id="LC11" class="line" lang="java">            <span class="o">{</span> <span class="s">"FileChooser.fileAttrHeader.textAndMnemonic"</span><span class="o">,</span> <span class="s">"Attributes"</span> <span class="o">},</span></span>
<span id="LC12" class="line" lang="java">            <span class="o">{</span> <span class="s">"FileChooser.fileDateHeader.textAndMnemonic"</span><span class="o">,</span> <span class="s">"Modified"</span> <span class="o">},</span></span>
<span id="LC13" class="line" lang="java">            <span class="o">{</span> <span class="s">"FileChooser.fileNameHeader.textAndMnemonic"</span><span class="o">,</span> <span class="s">"Name"</span> <span class="o">},</span></span>
<span id="LC14" class="line" lang="java">            <span class="o">{</span> <span class="s">"FileChooser.fileNameLabel.textAndMnemonic"</span><span class="o">,</span> <span class="s">"File &amp;name:"</span> <span class="o">},</span></span>
<span id="LC15" class="line" lang="java">            <span class="o">{</span> <span class="s">"FileChooser.fileSizeHeader.textAndMnemonic"</span><span class="o">,</span> <span class="s">"Size"</span> <span class="o">},</span></span>
<span id="LC16" class="line" lang="java">            <span class="o">{</span> <span class="s">"FileChooser.fileTypeHeader.textAndMnemonic"</span><span class="o">,</span> <span class="s">"Type"</span> <span class="o">},</span></span>
<span id="LC17" class="line" lang="java">            <span class="o">{</span> <span class="s">"FileChooser.filesOfTypeLabel.textAndMnemonic"</span><span class="o">,</span> <span class="s">"Files of &amp;type:"</span> <span class="o">},</span></span>
<span id="LC18" class="line" lang="java">            <span class="o">{</span> <span class="s">"FileChooser.folderNameLabel.textAndMnemonic"</span><span class="o">,</span> <span class="s">"Folder &amp;name:"</span> <span class="o">},</span></span>
<span id="LC19" class="line" lang="java">            <span class="o">{</span> <span class="s">"FileChooser.homeFolderAccessibleName"</span><span class="o">,</span> <span class="s">"Home"</span> <span class="o">},</span></span>
<span id="LC20" class="line" lang="java">            <span class="o">{</span> <span class="s">"FileChooser.homeFolderToolTip.textAndMnemonic"</span><span class="o">,</span> <span class="s">"Home"</span> <span class="o">},</span></span>
<span id="LC21" class="line" lang="java">            <span class="o">{</span> <span class="s">"FileChooser.listViewActionLabel.textAndMnemonic"</span><span class="o">,</span> <span class="s">"List"</span> <span class="o">},</span></span>
<span id="LC22" class="line" lang="java">            <span class="o">{</span> <span class="s">"FileChooser.listViewButtonAccessibleName"</span><span class="o">,</span> <span class="s">"List"</span> <span class="o">},</span></span>
<span id="LC23" class="line" lang="java">            <span class="o">{</span> <span class="s">"FileChooser.listViewButtonToolTip.textAndMnemonic"</span><span class="o">,</span> <span class="s">"List"</span> <span class="o">},</span></span>
<span id="LC24" class="line" lang="java">            <span class="o">{</span> <span class="s">"FileChooser.lookInLabel.textAndMnemonic"</span><span class="o">,</span> <span class="s">"Look &amp;in:"</span> <span class="o">},</span></span>
<span id="LC25" class="line" lang="java">            <span class="o">{</span> <span class="s">"FileChooser.newFolderAccessibleName"</span><span class="o">,</span> <span class="s">"New Folder"</span> <span class="o">},</span></span>
<span id="LC26" class="line" lang="java">            <span class="o">{</span> <span class="s">"FileChooser.newFolderActionLabel.textAndMnemonic"</span><span class="o">,</span> <span class="s">"New Folder"</span> <span class="o">},</span></span>
<span id="LC27" class="line" lang="java">            <span class="o">{</span> <span class="s">"FileChooser.newFolderToolTip.textAndMnemonic"</span><span class="o">,</span> <span class="s">"Create New Folder"</span> <span class="o">},</span></span>
<span id="LC28" class="line" lang="java">            <span class="o">{</span> <span class="s">"FileChooser.refreshActionLabel.textAndMnemonic"</span><span class="o">,</span> <span class="s">"Refresh"</span> <span class="o">},</span></span>
<span id="LC29" class="line" lang="java">            <span class="o">{</span> <span class="s">"FileChooser.saveInLabel.textAndMnemonic"</span><span class="o">,</span> <span class="s">"Save in:"</span> <span class="o">},</span></span>
<span id="LC30" class="line" lang="java">            <span class="o">{</span> <span class="s">"FileChooser.upFolderAccessibleName"</span><span class="o">,</span> <span class="s">"Up"</span> <span class="o">},</span></span>
<span id="LC31" class="line" lang="java">            <span class="o">{</span> <span class="s">"FileChooser.upFolderToolTip.textAndMnemonic"</span><span class="o">,</span> <span class="s">"Up One Level"</span> <span class="o">},</span></span>
<span id="LC32" class="line" lang="java">            <span class="o">{</span> <span class="s">"FileChooser.viewMenuButtonAccessibleName"</span><span class="o">,</span> <span class="s">"View Menu"</span> <span class="o">},</span></span>
<span id="LC33" class="line" lang="java">            <span class="o">{</span> <span class="s">"FileChooser.viewMenuButtonToolTipText"</span><span class="o">,</span> <span class="s">"View Menu"</span> <span class="o">},</span></span>
<span id="LC34" class="line" lang="java">            <span class="o">{</span> <span class="s">"FileChooser.viewMenuLabel.textAndMnemonic"</span><span class="o">,</span> <span class="s">"View"</span> <span class="o">},</span></span>
<span id="LC35" class="line" lang="java">        <span class="o">};</span></span>
<span id="LC36" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC37" class="line" lang="java"><span class="o">}</span></span>