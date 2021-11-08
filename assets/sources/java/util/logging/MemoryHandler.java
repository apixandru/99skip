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
<a class="file-line-num diff-line-num" data-line-number="38" href="#L38" id="L38">
38
</a>
<a class="file-line-num diff-line-num" data-line-number="39" href="#L39" id="L39">
39
</a>
<a class="file-line-num diff-line-num" data-line-number="40" href="#L40" id="L40">
40
</a>
<a class="file-line-num diff-line-num" data-line-number="41" href="#L41" id="L41">
41
</a>
<a class="file-line-num diff-line-num" data-line-number="42" href="#L42" id="L42">
42
</a>
<a class="file-line-num diff-line-num" data-line-number="43" href="#L43" id="L43">
43
</a>
<a class="file-line-num diff-line-num" data-line-number="44" href="#L44" id="L44">
44
</a>
<a class="file-line-num diff-line-num" data-line-number="45" href="#L45" id="L45">
45
</a>
<a class="file-line-num diff-line-num" data-line-number="46" href="#L46" id="L46">
46
</a>
<a class="file-line-num diff-line-num" data-line-number="47" href="#L47" id="L47">
47
</a>
<a class="file-line-num diff-line-num" data-line-number="48" href="#L48" id="L48">
48
</a>
<a class="file-line-num diff-line-num" data-line-number="49" href="#L49" id="L49">
49
</a>
<a class="file-line-num diff-line-num" data-line-number="50" href="#L50" id="L50">
50
</a>
<a class="file-line-num diff-line-num" data-line-number="51" href="#L51" id="L51">
51
</a>
<a class="file-line-num diff-line-num" data-line-number="52" href="#L52" id="L52">
52
</a>
<a class="file-line-num diff-line-num" data-line-number="53" href="#L53" id="L53">
53
</a>
<a class="file-line-num diff-line-num" data-line-number="54" href="#L54" id="L54">
54
</a>
<a class="file-line-num diff-line-num" data-line-number="55" href="#L55" id="L55">
55
</a>
<a class="file-line-num diff-line-num" data-line-number="56" href="#L56" id="L56">
56
</a>
<a class="file-line-num diff-line-num" data-line-number="57" href="#L57" id="L57">
57
</a>
<a class="file-line-num diff-line-num" data-line-number="58" href="#L58" id="L58">
58
</a>
<a class="file-line-num diff-line-num" data-line-number="59" href="#L59" id="L59">
59
</a>
<a class="file-line-num diff-line-num" data-line-number="60" href="#L60" id="L60">
60
</a>
<a class="file-line-num diff-line-num" data-line-number="61" href="#L61" id="L61">
61
</a>
<a class="file-line-num diff-line-num" data-line-number="62" href="#L62" id="L62">
62
</a>
<a class="file-line-num diff-line-num" data-line-number="63" href="#L63" id="L63">
63
</a>
<a class="file-line-num diff-line-num" data-line-number="64" href="#L64" id="L64">
64
</a>
<a class="file-line-num diff-line-num" data-line-number="65" href="#L65" id="L65">
65
</a>
<a class="file-line-num diff-line-num" data-line-number="66" href="#L66" id="L66">
66
</a>
<a class="file-line-num diff-line-num" data-line-number="67" href="#L67" id="L67">
67
</a>
<a class="file-line-num diff-line-num" data-line-number="68" href="#L68" id="L68">
68
</a>
<a class="file-line-num diff-line-num" data-line-number="69" href="#L69" id="L69">
69
</a>
<a class="file-line-num diff-line-num" data-line-number="70" href="#L70" id="L70">
70
</a>
<a class="file-line-num diff-line-num" data-line-number="71" href="#L71" id="L71">
71
</a>
<a class="file-line-num diff-line-num" data-line-number="72" href="#L72" id="L72">
72
</a>
<a class="file-line-num diff-line-num" data-line-number="73" href="#L73" id="L73">
73
</a>
<a class="file-line-num diff-line-num" data-line-number="74" href="#L74" id="L74">
74
</a>
<a class="file-line-num diff-line-num" data-line-number="75" href="#L75" id="L75">
75
</a>
<a class="file-line-num diff-line-num" data-line-number="76" href="#L76" id="L76">
76
</a>
<a class="file-line-num diff-line-num" data-line-number="77" href="#L77" id="L77">
77
</a>
<a class="file-line-num diff-line-num" data-line-number="78" href="#L78" id="L78">
78
</a>
<a class="file-line-num diff-line-num" data-line-number="79" href="#L79" id="L79">
79
</a>
<a class="file-line-num diff-line-num" data-line-number="80" href="#L80" id="L80">
80
</a>
<a class="file-line-num diff-line-num" data-line-number="81" href="#L81" id="L81">
81
</a>
<a class="file-line-num diff-line-num" data-line-number="82" href="#L82" id="L82">
82
</a>
<a class="file-line-num diff-line-num" data-line-number="83" href="#L83" id="L83">
83
</a>
<a class="file-line-num diff-line-num" data-line-number="84" href="#L84" id="L84">
84
</a>
<a class="file-line-num diff-line-num" data-line-number="85" href="#L85" id="L85">
85
</a>
<a class="file-line-num diff-line-num" data-line-number="86" href="#L86" id="L86">
86
</a>
<a class="file-line-num diff-line-num" data-line-number="87" href="#L87" id="L87">
87
</a>
<a class="file-line-num diff-line-num" data-line-number="88" href="#L88" id="L88">
88
</a>
<a class="file-line-num diff-line-num" data-line-number="89" href="#L89" id="L89">
89
</a>
<a class="file-line-num diff-line-num" data-line-number="90" href="#L90" id="L90">
90
</a>
<a class="file-line-num diff-line-num" data-line-number="91" href="#L91" id="L91">
91
</a>
<a class="file-line-num diff-line-num" data-line-number="92" href="#L92" id="L92">
92
</a>
<a class="file-line-num diff-line-num" data-line-number="93" href="#L93" id="L93">
93
</a>
<a class="file-line-num diff-line-num" data-line-number="94" href="#L94" id="L94">
94
</a>
<a class="file-line-num diff-line-num" data-line-number="95" href="#L95" id="L95">
95
</a>
<a class="file-line-num diff-line-num" data-line-number="96" href="#L96" id="L96">
96
</a>
<a class="file-line-num diff-line-num" data-line-number="97" href="#L97" id="L97">
97
</a>
<a class="file-line-num diff-line-num" data-line-number="98" href="#L98" id="L98">
98
</a>
<a class="file-line-num diff-line-num" data-line-number="99" href="#L99" id="L99">
99
</a>
<a class="file-line-num diff-line-num" data-line-number="100" href="#L100" id="L100">
100
</a>
<a class="file-line-num diff-line-num" data-line-number="101" href="#L101" id="L101">
101
</a>
<a class="file-line-num diff-line-num" data-line-number="102" href="#L102" id="L102">
102
</a>
<a class="file-line-num diff-line-num" data-line-number="103" href="#L103" id="L103">
103
</a>
<a class="file-line-num diff-line-num" data-line-number="104" href="#L104" id="L104">
104
</a>
<a class="file-line-num diff-line-num" data-line-number="105" href="#L105" id="L105">
105
</a>
<a class="file-line-num diff-line-num" data-line-number="106" href="#L106" id="L106">
106
</a>
<a class="file-line-num diff-line-num" data-line-number="107" href="#L107" id="L107">
107
</a>
<a class="file-line-num diff-line-num" data-line-number="108" href="#L108" id="L108">
108
</a>
<a class="file-line-num diff-line-num" data-line-number="109" href="#L109" id="L109">
109
</a>
<a class="file-line-num diff-line-num" data-line-number="110" href="#L110" id="L110">
110
</a>
<a class="file-line-num diff-line-num" data-line-number="111" href="#L111" id="L111">
111
</a>
<a class="file-line-num diff-line-num" data-line-number="112" href="#L112" id="L112">
112
</a>
<a class="file-line-num diff-line-num" data-line-number="113" href="#L113" id="L113">
113
</a>
<a class="file-line-num diff-line-num" data-line-number="114" href="#L114" id="L114">
114
</a>
<a class="file-line-num diff-line-num" data-line-number="115" href="#L115" id="L115">
115
</a>
<a class="file-line-num diff-line-num" data-line-number="116" href="#L116" id="L116">
116
</a>
<a class="file-line-num diff-line-num" data-line-number="117" href="#L117" id="L117">
117
</a>
<a class="file-line-num diff-line-num" data-line-number="118" href="#L118" id="L118">
118
</a>
<a class="file-line-num diff-line-num" data-line-number="119" href="#L119" id="L119">
119
</a>
<a class="file-line-num diff-line-num" data-line-number="120" href="#L120" id="L120">
120
</a>
<a class="file-line-num diff-line-num" data-line-number="121" href="#L121" id="L121">
121
</a>
<a class="file-line-num diff-line-num" data-line-number="122" href="#L122" id="L122">
122
</a>
<a class="file-line-num diff-line-num" data-line-number="123" href="#L123" id="L123">
123
</a>
<a class="file-line-num diff-line-num" data-line-number="124" href="#L124" id="L124">
124
</a>
<a class="file-line-num diff-line-num" data-line-number="125" href="#L125" id="L125">
125
</a>
<a class="file-line-num diff-line-num" data-line-number="126" href="#L126" id="L126">
126
</a>
<a class="file-line-num diff-line-num" data-line-number="127" href="#L127" id="L127">
127
</a>
<a class="file-line-num diff-line-num" data-line-number="128" href="#L128" id="L128">
128
</a>
<a class="file-line-num diff-line-num" data-line-number="129" href="#L129" id="L129">
129
</a>
<a class="file-line-num diff-line-num" data-line-number="130" href="#L130" id="L130">
130
</a>
<a class="file-line-num diff-line-num" data-line-number="131" href="#L131" id="L131">
131
</a>
<a class="file-line-num diff-line-num" data-line-number="132" href="#L132" id="L132">
132
</a>
<a class="file-line-num diff-line-num" data-line-number="133" href="#L133" id="L133">
133
</a>
<a class="file-line-num diff-line-num" data-line-number="134" href="#L134" id="L134">
134
</a>
<a class="file-line-num diff-line-num" data-line-number="135" href="#L135" id="L135">
135
</a>
<a class="file-line-num diff-line-num" data-line-number="136" href="#L136" id="L136">
136
</a>
<a class="file-line-num diff-line-num" data-line-number="137" href="#L137" id="L137">
137
</a>
<a class="file-line-num diff-line-num" data-line-number="138" href="#L138" id="L138">
138
</a>
<a class="file-line-num diff-line-num" data-line-number="139" href="#L139" id="L139">
139
</a>
<a class="file-line-num diff-line-num" data-line-number="140" href="#L140" id="L140">
140
</a>
<a class="file-line-num diff-line-num" data-line-number="141" href="#L141" id="L141">
141
</a>
<a class="file-line-num diff-line-num" data-line-number="142" href="#L142" id="L142">
142
</a>
<a class="file-line-num diff-line-num" data-line-number="143" href="#L143" id="L143">
143
</a>
<a class="file-line-num diff-line-num" data-line-number="144" href="#L144" id="L144">
144
</a>
<a class="file-line-num diff-line-num" data-line-number="145" href="#L145" id="L145">
145
</a>
<a class="file-line-num diff-line-num" data-line-number="146" href="#L146" id="L146">
146
</a>
<a class="file-line-num diff-line-num" data-line-number="147" href="#L147" id="L147">
147
</a>
<a class="file-line-num diff-line-num" data-line-number="148" href="#L148" id="L148">
148
</a>
<a class="file-line-num diff-line-num" data-line-number="149" href="#L149" id="L149">
149
</a>
<a class="file-line-num diff-line-num" data-line-number="150" href="#L150" id="L150">
150
</a>
<a class="file-line-num diff-line-num" data-line-number="151" href="#L151" id="L151">
151
</a>
<a class="file-line-num diff-line-num" data-line-number="152" href="#L152" id="L152">
152
</a>
<a class="file-line-num diff-line-num" data-line-number="153" href="#L153" id="L153">
153
</a>
<a class="file-line-num diff-line-num" data-line-number="154" href="#L154" id="L154">
154
</a>
<a class="file-line-num diff-line-num" data-line-number="155" href="#L155" id="L155">
155
</a>
<a class="file-line-num diff-line-num" data-line-number="156" href="#L156" id="L156">
156
</a>
<a class="file-line-num diff-line-num" data-line-number="157" href="#L157" id="L157">
157
</a>
<a class="file-line-num diff-line-num" data-line-number="158" href="#L158" id="L158">
158
</a>
<a class="file-line-num diff-line-num" data-line-number="159" href="#L159" id="L159">
159
</a>
<a class="file-line-num diff-line-num" data-line-number="160" href="#L160" id="L160">
160
</a>
<a class="file-line-num diff-line-num" data-line-number="161" href="#L161" id="L161">
161
</a>
<a class="file-line-num diff-line-num" data-line-number="162" href="#L162" id="L162">
162
</a>
<a class="file-line-num diff-line-num" data-line-number="163" href="#L163" id="L163">
163
</a>
<a class="file-line-num diff-line-num" data-line-number="164" href="#L164" id="L164">
164
</a>
<a class="file-line-num diff-line-num" data-line-number="165" href="#L165" id="L165">
165
</a>
<a class="file-line-num diff-line-num" data-line-number="166" href="#L166" id="L166">
166
</a>
<a class="file-line-num diff-line-num" data-line-number="167" href="#L167" id="L167">
167
</a>
<a class="file-line-num diff-line-num" data-line-number="168" href="#L168" id="L168">
168
</a>
<a class="file-line-num diff-line-num" data-line-number="169" href="#L169" id="L169">
169
</a>
<a class="file-line-num diff-line-num" data-line-number="170" href="#L170" id="L170">
170
</a>
<a class="file-line-num diff-line-num" data-line-number="171" href="#L171" id="L171">
171
</a>
<a class="file-line-num diff-line-num" data-line-number="172" href="#L172" id="L172">
172
</a>
<a class="file-line-num diff-line-num" data-line-number="173" href="#L173" id="L173">
173
</a>
<a class="file-line-num diff-line-num" data-line-number="174" href="#L174" id="L174">
174
</a>
<a class="file-line-num diff-line-num" data-line-number="175" href="#L175" id="L175">
175
</a>
<a class="file-line-num diff-line-num" data-line-number="176" href="#L176" id="L176">
176
</a>
<a class="file-line-num diff-line-num" data-line-number="177" href="#L177" id="L177">
177
</a>
<a class="file-line-num diff-line-num" data-line-number="178" href="#L178" id="L178">
178
</a>
<a class="file-line-num diff-line-num" data-line-number="179" href="#L179" id="L179">
179
</a>
<a class="file-line-num diff-line-num" data-line-number="180" href="#L180" id="L180">
180
</a>
<a class="file-line-num diff-line-num" data-line-number="181" href="#L181" id="L181">
181
</a>
<a class="file-line-num diff-line-num" data-line-number="182" href="#L182" id="L182">
182
</a>
<a class="file-line-num diff-line-num" data-line-number="183" href="#L183" id="L183">
183
</a>
<a class="file-line-num diff-line-num" data-line-number="184" href="#L184" id="L184">
184
</a>
<a class="file-line-num diff-line-num" data-line-number="185" href="#L185" id="L185">
185
</a>
<a class="file-line-num diff-line-num" data-line-number="186" href="#L186" id="L186">
186
</a>
<a class="file-line-num diff-line-num" data-line-number="187" href="#L187" id="L187">
187
</a>
<a class="file-line-num diff-line-num" data-line-number="188" href="#L188" id="L188">
188
</a>
<a class="file-line-num diff-line-num" data-line-number="189" href="#L189" id="L189">
189
</a>
<a class="file-line-num diff-line-num" data-line-number="190" href="#L190" id="L190">
190
</a>
<a class="file-line-num diff-line-num" data-line-number="191" href="#L191" id="L191">
191
</a>
<a class="file-line-num diff-line-num" data-line-number="192" href="#L192" id="L192">
192
</a>
<a class="file-line-num diff-line-num" data-line-number="193" href="#L193" id="L193">
193
</a>
<a class="file-line-num diff-line-num" data-line-number="194" href="#L194" id="L194">
194
</a>
<a class="file-line-num diff-line-num" data-line-number="195" href="#L195" id="L195">
195
</a>
<a class="file-line-num diff-line-num" data-line-number="196" href="#L196" id="L196">
196
</a>
<a class="file-line-num diff-line-num" data-line-number="197" href="#L197" id="L197">
197
</a>
<a class="file-line-num diff-line-num" data-line-number="198" href="#L198" id="L198">
198
</a>
<a class="file-line-num diff-line-num" data-line-number="199" href="#L199" id="L199">
199
</a>
<a class="file-line-num diff-line-num" data-line-number="200" href="#L200" id="L200">
200
</a>
<a class="file-line-num diff-line-num" data-line-number="201" href="#L201" id="L201">
201
</a>
<a class="file-line-num diff-line-num" data-line-number="202" href="#L202" id="L202">
202
</a>
<a class="file-line-num diff-line-num" data-line-number="203" href="#L203" id="L203">
203
</a>
<a class="file-line-num diff-line-num" data-line-number="204" href="#L204" id="L204">
204
</a>
<a class="file-line-num diff-line-num" data-line-number="205" href="#L205" id="L205">
205
</a>
<a class="file-line-num diff-line-num" data-line-number="206" href="#L206" id="L206">
206
</a>
<a class="file-line-num diff-line-num" data-line-number="207" href="#L207" id="L207">
207
</a>
<a class="file-line-num diff-line-num" data-line-number="208" href="#L208" id="L208">
208
</a>
<a class="file-line-num diff-line-num" data-line-number="209" href="#L209" id="L209">
209
</a>
<a class="file-line-num diff-line-num" data-line-number="210" href="#L210" id="L210">
210
</a>
<a class="file-line-num diff-line-num" data-line-number="211" href="#L211" id="L211">
211
</a>
<a class="file-line-num diff-line-num" data-line-number="212" href="#L212" id="L212">
212
</a>
<a class="file-line-num diff-line-num" data-line-number="213" href="#L213" id="L213">
213
</a>
<a class="file-line-num diff-line-num" data-line-number="214" href="#L214" id="L214">
214
</a>
<a class="file-line-num diff-line-num" data-line-number="215" href="#L215" id="L215">
215
</a>
<a class="file-line-num diff-line-num" data-line-number="216" href="#L216" id="L216">
216
</a>
<a class="file-line-num diff-line-num" data-line-number="217" href="#L217" id="L217">
217
</a>
<a class="file-line-num diff-line-num" data-line-number="218" href="#L218" id="L218">
218
</a>
<a class="file-line-num diff-line-num" data-line-number="219" href="#L219" id="L219">
219
</a>
<a class="file-line-num diff-line-num" data-line-number="220" href="#L220" id="L220">
220
</a>
<a class="file-line-num diff-line-num" data-line-number="221" href="#L221" id="L221">
221
</a>
<a class="file-line-num diff-line-num" data-line-number="222" href="#L222" id="L222">
222
</a>
<a class="file-line-num diff-line-num" data-line-number="223" href="#L223" id="L223">
223
</a>
<a class="file-line-num diff-line-num" data-line-number="224" href="#L224" id="L224">
224
</a>
<a class="file-line-num diff-line-num" data-line-number="225" href="#L225" id="L225">
225
</a>
<a class="file-line-num diff-line-num" data-line-number="226" href="#L226" id="L226">
226
</a>
<a class="file-line-num diff-line-num" data-line-number="227" href="#L227" id="L227">
227
</a>
<a class="file-line-num diff-line-num" data-line-number="228" href="#L228" id="L228">
228
</a>
<a class="file-line-num diff-line-num" data-line-number="229" href="#L229" id="L229">
229
</a>
<a class="file-line-num diff-line-num" data-line-number="230" href="#L230" id="L230">
230
</a>
<a class="file-line-num diff-line-num" data-line-number="231" href="#L231" id="L231">
231
</a>
<a class="file-line-num diff-line-num" data-line-number="232" href="#L232" id="L232">
232
</a>
<a class="file-line-num diff-line-num" data-line-number="233" href="#L233" id="L233">
233
</a>
<a class="file-line-num diff-line-num" data-line-number="234" href="#L234" id="L234">
234
</a>
<a class="file-line-num diff-line-num" data-line-number="235" href="#L235" id="L235">
235
</a>
<a class="file-line-num diff-line-num" data-line-number="236" href="#L236" id="L236">
236
</a>
<a class="file-line-num diff-line-num" data-line-number="237" href="#L237" id="L237">
237
</a>
<a class="file-line-num diff-line-num" data-line-number="238" href="#L238" id="L238">
238
</a>
<a class="file-line-num diff-line-num" data-line-number="239" href="#L239" id="L239">
239
</a>
<a class="file-line-num diff-line-num" data-line-number="240" href="#L240" id="L240">
240
</a>
<a class="file-line-num diff-line-num" data-line-number="241" href="#L241" id="L241">
241
</a>
<a class="file-line-num diff-line-num" data-line-number="242" href="#L242" id="L242">
242
</a>
<a class="file-line-num diff-line-num" data-line-number="243" href="#L243" id="L243">
243
</a>
<a class="file-line-num diff-line-num" data-line-number="244" href="#L244" id="L244">
244
</a>
<a class="file-line-num diff-line-num" data-line-number="245" href="#L245" id="L245">
245
</a>
<a class="file-line-num diff-line-num" data-line-number="246" href="#L246" id="L246">
246
</a>
<a class="file-line-num diff-line-num" data-line-number="247" href="#L247" id="L247">
247
</a>
<a class="file-line-num diff-line-num" data-line-number="248" href="#L248" id="L248">
248
</a>
<a class="file-line-num diff-line-num" data-line-number="249" href="#L249" id="L249">
249
</a>
<a class="file-line-num diff-line-num" data-line-number="250" href="#L250" id="L250">
250
</a>
<a class="file-line-num diff-line-num" data-line-number="251" href="#L251" id="L251">
251
</a>
<a class="file-line-num diff-line-num" data-line-number="252" href="#L252" id="L252">
252
</a>
<a class="file-line-num diff-line-num" data-line-number="253" href="#L253" id="L253">
253
</a>
<a class="file-line-num diff-line-num" data-line-number="254" href="#L254" id="L254">
254
</a>
<a class="file-line-num diff-line-num" data-line-number="255" href="#L255" id="L255">
255
</a>
<a class="file-line-num diff-line-num" data-line-number="256" href="#L256" id="L256">
256
</a>
<a class="file-line-num diff-line-num" data-line-number="257" href="#L257" id="L257">
257
</a>
<a class="file-line-num diff-line-num" data-line-number="258" href="#L258" id="L258">
258
</a>
<a class="file-line-num diff-line-num" data-line-number="259" href="#L259" id="L259">
259
</a>
<a class="file-line-num diff-line-num" data-line-number="260" href="#L260" id="L260">
260
</a>
<a class="file-line-num diff-line-num" data-line-number="261" href="#L261" id="L261">
261
</a>
<a class="file-line-num diff-line-num" data-line-number="262" href="#L262" id="L262">
262
</a>
<a class="file-line-num diff-line-num" data-line-number="263" href="#L263" id="L263">
263
</a>
<a class="file-line-num diff-line-num" data-line-number="264" href="#L264" id="L264">
264
</a>
<a class="file-line-num diff-line-num" data-line-number="265" href="#L265" id="L265">
265
</a>
<a class="file-line-num diff-line-num" data-line-number="266" href="#L266" id="L266">
266
</a>
<a class="file-line-num diff-line-num" data-line-number="267" href="#L267" id="L267">
267
</a>
<a class="file-line-num diff-line-num" data-line-number="268" href="#L268" id="L268">
268
</a>
<a class="file-line-num diff-line-num" data-line-number="269" href="#L269" id="L269">
269
</a>
<a class="file-line-num diff-line-num" data-line-number="270" href="#L270" id="L270">
270
</a>
<a class="file-line-num diff-line-num" data-line-number="271" href="#L271" id="L271">
271
</a>
<a class="file-line-num diff-line-num" data-line-number="272" href="#L272" id="L272">
272
</a>
<a class="file-line-num diff-line-num" data-line-number="273" href="#L273" id="L273">
273
</a>
<a class="file-line-num diff-line-num" data-line-number="274" href="#L274" id="L274">
274
</a>
<a class="file-line-num diff-line-num" data-line-number="275" href="#L275" id="L275">
275
</a>
<a class="file-line-num diff-line-num" data-line-number="276" href="#L276" id="L276">
276
</a>
<a class="file-line-num diff-line-num" data-line-number="277" href="#L277" id="L277">
277
</a>
<a class="file-line-num diff-line-num" data-line-number="278" href="#L278" id="L278">
278
</a>
<a class="file-line-num diff-line-num" data-line-number="279" href="#L279" id="L279">
279
</a>
<a class="file-line-num diff-line-num" data-line-number="280" href="#L280" id="L280">
280
</a>
<a class="file-line-num diff-line-num" data-line-number="281" href="#L281" id="L281">
281
</a>
<a class="file-line-num diff-line-num" data-line-number="282" href="#L282" id="L282">
282
</a>
<a class="file-line-num diff-line-num" data-line-number="283" href="#L283" id="L283">
283
</a>
<a class="file-line-num diff-line-num" data-line-number="284" href="#L284" id="L284">
284
</a>
<a class="file-line-num diff-line-num" data-line-number="285" href="#L285" id="L285">
285
</a>
<a class="file-line-num diff-line-num" data-line-number="286" href="#L286" id="L286">
286
</a>
<a class="file-line-num diff-line-num" data-line-number="287" href="#L287" id="L287">
287
</a>
<a class="file-line-num diff-line-num" data-line-number="288" href="#L288" id="L288">
288
</a>
<a class="file-line-num diff-line-num" data-line-number="289" href="#L289" id="L289">
289
</a>
<a class="file-line-num diff-line-num" data-line-number="290" href="#L290" id="L290">
290
</a>
<a class="file-line-num diff-line-num" data-line-number="291" href="#L291" id="L291">
291
</a>
<a class="file-line-num diff-line-num" data-line-number="292" href="#L292" id="L292">
292
</a>
</div>
<div class="blob-content" data-blob-id="01dd3290f8c8cbdeab0a2428d8b775a16a063bc5" data-path="src/main/java/org/apache/commons/lang3/StringUtils.java" data-qa-selector="file_content">
<pre class="code highlight"><code><span id="LC1" class="line" lang="java"><span class="cm">/*</span></span>
<span id="LC2" class="line" lang="java"><span class="cm"> * Copyright (c) 2000, 2013, Oracle and/or its affiliates. All rights reserved.</span></span>
<span id="LC3" class="line" lang="java"><span class="cm"> * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.</span></span>
<span id="LC4" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC5" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC6" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC7" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC8" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC9" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC10" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC11" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC12" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC13" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC14" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC15" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC16" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC17" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC18" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC19" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC20" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC21" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC22" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC23" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC24" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC25" class="line" lang="java"></span>
<span id="LC26" class="line" lang="java"><span class="kn">package</span> <span class="nn">java.util.logging</span><span class="o">;</span></span>
<span id="LC27" class="line" lang="java"></span>
<span id="LC28" class="line" lang="java"><span class="cm">/**</span></span>
<span id="LC29" class="line" lang="java"><span class="cm"> * &lt;tt&gt;Handler&lt;/tt&gt; that buffers requests in a circular buffer in memory.</span></span>
<span id="LC30" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC31" class="line" lang="java"><span class="cm"> * Normally this &lt;tt&gt;Handler&lt;/tt&gt; simply stores incoming &lt;tt&gt;LogRecords&lt;/tt&gt;</span></span>
<span id="LC32" class="line" lang="java"><span class="cm"> * into its memory buffer and discards earlier records.  This buffering</span></span>
<span id="LC33" class="line" lang="java"><span class="cm"> * is very cheap and avoids formatting costs.  On certain trigger</span></span>
<span id="LC34" class="line" lang="java"><span class="cm"> * conditions, the &lt;tt&gt;MemoryHandler&lt;/tt&gt; will push out its current buffer</span></span>
<span id="LC35" class="line" lang="java"><span class="cm"> * contents to a target &lt;tt&gt;Handler&lt;/tt&gt;, which will typically publish</span></span>
<span id="LC36" class="line" lang="java"><span class="cm"> * them to the outside world.</span></span>
<span id="LC37" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC38" class="line" lang="java"><span class="cm"> * There are three main models for triggering a push of the buffer:</span></span>
<span id="LC39" class="line" lang="java"><span class="cm"> * &lt;ul&gt;</span></span>
<span id="LC40" class="line" lang="java"><span class="cm"> * &lt;li&gt;</span></span>
<span id="LC41" class="line" lang="java"><span class="cm"> * An incoming &lt;tt&gt;LogRecord&lt;/tt&gt; has a type that is greater than</span></span>
<span id="LC42" class="line" lang="java"><span class="cm"> * a pre-defined level, the &lt;tt&gt;pushLevel&lt;/tt&gt;. &lt;/li&gt;</span></span>
<span id="LC43" class="line" lang="java"><span class="cm"> * &lt;li&gt;</span></span>
<span id="LC44" class="line" lang="java"><span class="cm"> * An external class calls the &lt;tt&gt;push&lt;/tt&gt; method explicitly. &lt;/li&gt;</span></span>
<span id="LC45" class="line" lang="java"><span class="cm"> * &lt;li&gt;</span></span>
<span id="LC46" class="line" lang="java"><span class="cm"> * A subclass overrides the &lt;tt&gt;log&lt;/tt&gt; method and scans each incoming</span></span>
<span id="LC47" class="line" lang="java"><span class="cm"> * &lt;tt&gt;LogRecord&lt;/tt&gt; and calls &lt;tt&gt;push&lt;/tt&gt; if a record matches some</span></span>
<span id="LC48" class="line" lang="java"><span class="cm"> * desired criteria. &lt;/li&gt;</span></span>
<span id="LC49" class="line" lang="java"><span class="cm"> * &lt;/ul&gt;</span></span>
<span id="LC50" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC51" class="line" lang="java"><span class="cm"> * &lt;b&gt;Configuration:&lt;/b&gt;</span></span>
<span id="LC52" class="line" lang="java"><span class="cm"> * By default each &lt;tt&gt;MemoryHandler&lt;/tt&gt; is initialized using the following</span></span>
<span id="LC53" class="line" lang="java"><span class="cm"> * &lt;tt&gt;LogManager&lt;/tt&gt; configuration properties where &lt;tt&gt;&amp;lt;handler-name&amp;gt;&lt;/tt&gt;</span></span>
<span id="LC54" class="line" lang="java"><span class="cm"> * refers to the fully-qualified class name of the handler.</span></span>
<span id="LC55" class="line" lang="java"><span class="cm"> * If properties are not defined</span></span>
<span id="LC56" class="line" lang="java"><span class="cm"> * (or have invalid values) then the specified default values are used.</span></span>
<span id="LC57" class="line" lang="java"><span class="cm"> * If no default value is defined then a RuntimeException is thrown.</span></span>
<span id="LC58" class="line" lang="java"><span class="cm"> * &lt;ul&gt;</span></span>
<span id="LC59" class="line" lang="java"><span class="cm"> * &lt;li&gt;   &amp;lt;handler-name&amp;gt;.level</span></span>
<span id="LC60" class="line" lang="java"><span class="cm"> *        specifies the level for the &lt;tt&gt;Handler&lt;/tt&gt;</span></span>
<span id="LC61" class="line" lang="java"><span class="cm"> *        (defaults to &lt;tt&gt;Level.ALL&lt;/tt&gt;). &lt;/li&gt;</span></span>
<span id="LC62" class="line" lang="java"><span class="cm"> * &lt;li&gt;   &amp;lt;handler-name&amp;gt;.filter</span></span>
<span id="LC63" class="line" lang="java"><span class="cm"> *        specifies the name of a &lt;tt&gt;Filter&lt;/tt&gt; class to use</span></span>
<span id="LC64" class="line" lang="java"><span class="cm"> *        (defaults to no &lt;tt&gt;Filter&lt;/tt&gt;). &lt;/li&gt;</span></span>
<span id="LC65" class="line" lang="java"><span class="cm"> * &lt;li&gt;   &amp;lt;handler-name&amp;gt;.size</span></span>
<span id="LC66" class="line" lang="java"><span class="cm"> *        defines the buffer size (defaults to 1000). &lt;/li&gt;</span></span>
<span id="LC67" class="line" lang="java"><span class="cm"> * &lt;li&gt;   &amp;lt;handler-name&amp;gt;.push</span></span>
<span id="LC68" class="line" lang="java"><span class="cm"> *        defines the &lt;tt&gt;pushLevel&lt;/tt&gt; (defaults to &lt;tt&gt;level.SEVERE&lt;/tt&gt;). &lt;/li&gt;</span></span>
<span id="LC69" class="line" lang="java"><span class="cm"> * &lt;li&gt;   &amp;lt;handler-name&amp;gt;.target</span></span>
<span id="LC70" class="line" lang="java"><span class="cm"> *        specifies the name of the target &lt;tt&gt;Handler &lt;/tt&gt; class.</span></span>
<span id="LC71" class="line" lang="java"><span class="cm"> *        (no default). &lt;/li&gt;</span></span>
<span id="LC72" class="line" lang="java"><span class="cm"> * &lt;/ul&gt;</span></span>
<span id="LC73" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC74" class="line" lang="java"><span class="cm"> * For example, the properties for {@code MemoryHandler} would be:</span></span>
<span id="LC75" class="line" lang="java"><span class="cm"> * &lt;ul&gt;</span></span>
<span id="LC76" class="line" lang="java"><span class="cm"> * &lt;li&gt;   java.util.logging.MemoryHandler.level=INFO &lt;/li&gt;</span></span>
<span id="LC77" class="line" lang="java"><span class="cm"> * &lt;li&gt;   java.util.logging.MemoryHandler.formatter=java.util.logging.SimpleFormatter &lt;/li&gt;</span></span>
<span id="LC78" class="line" lang="java"><span class="cm"> * &lt;/ul&gt;</span></span>
<span id="LC79" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC80" class="line" lang="java"><span class="cm"> * For a custom handler, e.g. com.foo.MyHandler, the properties would be:</span></span>
<span id="LC81" class="line" lang="java"><span class="cm"> * &lt;ul&gt;</span></span>
<span id="LC82" class="line" lang="java"><span class="cm"> * &lt;li&gt;   com.foo.MyHandler.level=INFO &lt;/li&gt;</span></span>
<span id="LC83" class="line" lang="java"><span class="cm"> * &lt;li&gt;   com.foo.MyHandler.formatter=java.util.logging.SimpleFormatter &lt;/li&gt;</span></span>
<span id="LC84" class="line" lang="java"><span class="cm"> * &lt;/ul&gt;</span></span>
<span id="LC85" class="line" lang="java"><span class="cm"> * &lt;p&gt;</span></span>
<span id="LC86" class="line" lang="java"><span class="cm"> * @since 1.4</span></span>
<span id="LC87" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC88" class="line" lang="java"></span>
<span id="LC89" class="line" lang="java"><span class="kd">public</span> <span class="kd">class</span> <span class="nc">MemoryHandler</span> <span class="kd">extends</span> <span class="nc">Handler</span> <span class="o">{</span></span>
<span id="LC90" class="line" lang="java">    <span class="kd">private</span> <span class="kd">final</span> <span class="kd">static</span> <span class="kt">int</span> <span class="no">DEFAULT_SIZE</span> <span class="o">=</span> <span class="mi">1000</span><span class="o">;</span></span>
<span id="LC91" class="line" lang="java">    <span class="kd">private</span> <span class="kd">volatile</span> <span class="nc">Level</span> <span class="n">pushLevel</span><span class="o">;</span></span>
<span id="LC92" class="line" lang="java">    <span class="kd">private</span> <span class="kt">int</span> <span class="n">size</span><span class="o">;</span></span>
<span id="LC93" class="line" lang="java">    <span class="kd">private</span> <span class="nc">Handler</span> <span class="n">target</span><span class="o">;</span></span>
<span id="LC94" class="line" lang="java">    <span class="kd">private</span> <span class="nc">LogRecord</span> <span class="n">buffer</span><span class="o">[];</span></span>
<span id="LC95" class="line" lang="java">    <span class="kt">int</span> <span class="n">start</span><span class="o">,</span> <span class="n">count</span><span class="o">;</span></span>
<span id="LC96" class="line" lang="java"></span>
<span id="LC97" class="line" lang="java">    <span class="c1">// Private method to configure a MemoryHandler from LogManager</span></span>
<span id="LC98" class="line" lang="java">    <span class="c1">// properties and/or default values as specified in the class</span></span>
<span id="LC99" class="line" lang="java">    <span class="c1">// javadoc.</span></span>
<span id="LC100" class="line" lang="java">    <span class="kd">private</span> <span class="kt">void</span> <span class="nf">configure</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC101" class="line" lang="java">        <span class="nc">LogManager</span> <span class="n">manager</span> <span class="o">=</span> <span class="nc">LogManager</span><span class="o">.</span><span class="na">getLogManager</span><span class="o">();</span></span>
<span id="LC102" class="line" lang="java">        <span class="nc">String</span> <span class="n">cname</span> <span class="o">=</span> <span class="n">getClass</span><span class="o">().</span><span class="na">getName</span><span class="o">();</span></span>
<span id="LC103" class="line" lang="java"></span>
<span id="LC104" class="line" lang="java">        <span class="n">pushLevel</span> <span class="o">=</span> <span class="n">manager</span><span class="o">.</span><span class="na">getLevelProperty</span><span class="o">(</span><span class="n">cname</span> <span class="o">+</span><span class="s">".push"</span><span class="o">,</span> <span class="nc">Level</span><span class="o">.</span><span class="na">SEVERE</span><span class="o">);</span></span>
<span id="LC105" class="line" lang="java">        <span class="n">size</span> <span class="o">=</span> <span class="n">manager</span><span class="o">.</span><span class="na">getIntProperty</span><span class="o">(</span><span class="n">cname</span> <span class="o">+</span> <span class="s">".size"</span><span class="o">,</span> <span class="no">DEFAULT_SIZE</span><span class="o">);</span></span>
<span id="LC106" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">size</span> <span class="o">&lt;=</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC107" class="line" lang="java">            <span class="n">size</span> <span class="o">=</span> <span class="no">DEFAULT_SIZE</span><span class="o">;</span></span>
<span id="LC108" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC109" class="line" lang="java">        <span class="n">setLevel</span><span class="o">(</span><span class="n">manager</span><span class="o">.</span><span class="na">getLevelProperty</span><span class="o">(</span><span class="n">cname</span> <span class="o">+</span><span class="s">".level"</span><span class="o">,</span> <span class="nc">Level</span><span class="o">.</span><span class="na">ALL</span><span class="o">));</span></span>
<span id="LC110" class="line" lang="java">        <span class="n">setFilter</span><span class="o">(</span><span class="n">manager</span><span class="o">.</span><span class="na">getFilterProperty</span><span class="o">(</span><span class="n">cname</span> <span class="o">+</span><span class="s">".filter"</span><span class="o">,</span> <span class="kc">null</span><span class="o">));</span></span>
<span id="LC111" class="line" lang="java">        <span class="n">setFormatter</span><span class="o">(</span><span class="n">manager</span><span class="o">.</span><span class="na">getFormatterProperty</span><span class="o">(</span><span class="n">cname</span> <span class="o">+</span><span class="s">".formatter"</span><span class="o">,</span> <span class="k">new</span> <span class="nc">SimpleFormatter</span><span class="o">()));</span></span>
<span id="LC112" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC113" class="line" lang="java"></span>
<span id="LC114" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC115" class="line" lang="java"><span class="cm">     * Create a &lt;tt&gt;MemoryHandler&lt;/tt&gt; and configure it based on</span></span>
<span id="LC116" class="line" lang="java"><span class="cm">     * &lt;tt&gt;LogManager&lt;/tt&gt; configuration properties.</span></span>
<span id="LC117" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC118" class="line" lang="java">    <span class="kd">public</span> <span class="nf">MemoryHandler</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC119" class="line" lang="java">        <span class="n">sealed</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC120" class="line" lang="java">        <span class="n">configure</span><span class="o">();</span></span>
<span id="LC121" class="line" lang="java">        <span class="n">sealed</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC122" class="line" lang="java"></span>
<span id="LC123" class="line" lang="java">        <span class="nc">LogManager</span> <span class="n">manager</span> <span class="o">=</span> <span class="nc">LogManager</span><span class="o">.</span><span class="na">getLogManager</span><span class="o">();</span></span>
<span id="LC124" class="line" lang="java">        <span class="nc">String</span> <span class="n">handlerName</span> <span class="o">=</span> <span class="n">getClass</span><span class="o">().</span><span class="na">getName</span><span class="o">();</span></span>
<span id="LC125" class="line" lang="java">        <span class="nc">String</span> <span class="n">targetName</span> <span class="o">=</span> <span class="n">manager</span><span class="o">.</span><span class="na">getProperty</span><span class="o">(</span><span class="n">handlerName</span><span class="o">+</span><span class="s">".target"</span><span class="o">);</span></span>
<span id="LC126" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">targetName</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC127" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">RuntimeException</span><span class="o">(</span><span class="s">"The handler "</span> <span class="o">+</span> <span class="n">handlerName</span></span>
<span id="LC128" class="line" lang="java">                    <span class="o">+</span> <span class="s">" does not specify a target"</span><span class="o">);</span></span>
<span id="LC129" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC130" class="line" lang="java">        <span class="nc">Class</span><span class="o">&lt;?&gt;</span> <span class="n">clz</span><span class="o">;</span></span>
<span id="LC131" class="line" lang="java">        <span class="k">try</span> <span class="o">{</span></span>
<span id="LC132" class="line" lang="java">            <span class="n">clz</span> <span class="o">=</span> <span class="nc">ClassLoader</span><span class="o">.</span><span class="na">getSystemClassLoader</span><span class="o">().</span><span class="na">loadClass</span><span class="o">(</span><span class="n">targetName</span><span class="o">);</span></span>
<span id="LC133" class="line" lang="java">            <span class="n">target</span> <span class="o">=</span> <span class="o">(</span><span class="nc">Handler</span><span class="o">)</span> <span class="n">clz</span><span class="o">.</span><span class="na">newInstance</span><span class="o">();</span></span>
<span id="LC134" class="line" lang="java">        <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">ClassNotFoundException</span> <span class="o">|</span> <span class="nc">InstantiationException</span> <span class="o">|</span> <span class="nc">IllegalAccessException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC135" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">RuntimeException</span><span class="o">(</span><span class="s">"MemoryHandler can't load handler target \""</span> <span class="o">+</span> <span class="n">targetName</span> <span class="o">+</span> <span class="s">"\""</span> <span class="o">,</span> <span class="n">e</span><span class="o">);</span></span>
<span id="LC136" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC137" class="line" lang="java">        <span class="n">init</span><span class="o">();</span></span>
<span id="LC138" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC139" class="line" lang="java"></span>
<span id="LC140" class="line" lang="java">    <span class="c1">// Initialize.  Size is a count of LogRecords.</span></span>
<span id="LC141" class="line" lang="java">    <span class="kd">private</span> <span class="kt">void</span> <span class="nf">init</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC142" class="line" lang="java">        <span class="n">buffer</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">LogRecord</span><span class="o">[</span><span class="n">size</span><span class="o">];</span></span>
<span id="LC143" class="line" lang="java">        <span class="n">start</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC144" class="line" lang="java">        <span class="n">count</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC145" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC146" class="line" lang="java"></span>
<span id="LC147" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC148" class="line" lang="java"><span class="cm">     * Create a &lt;tt&gt;MemoryHandler&lt;/tt&gt;.</span></span>
<span id="LC149" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC150" class="line" lang="java"><span class="cm">     * The &lt;tt&gt;MemoryHandler&lt;/tt&gt; is configured based on &lt;tt&gt;LogManager&lt;/tt&gt;</span></span>
<span id="LC151" class="line" lang="java"><span class="cm">     * properties (or their default values) except that the given &lt;tt&gt;pushLevel&lt;/tt&gt;</span></span>
<span id="LC152" class="line" lang="java"><span class="cm">     * argument and buffer size argument are used.</span></span>
<span id="LC153" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC154" class="line" lang="java"><span class="cm">     * @param target  the Handler to which to publish output.</span></span>
<span id="LC155" class="line" lang="java"><span class="cm">     * @param size    the number of log records to buffer (must be greater than zero)</span></span>
<span id="LC156" class="line" lang="java"><span class="cm">     * @param pushLevel  message level to push on</span></span>
<span id="LC157" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC158" class="line" lang="java"><span class="cm">     * @throws IllegalArgumentException if {@code size is &lt;= 0}</span></span>
<span id="LC159" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC160" class="line" lang="java">    <span class="kd">public</span> <span class="nf">MemoryHandler</span><span class="o">(</span><span class="nc">Handler</span> <span class="n">target</span><span class="o">,</span> <span class="kt">int</span> <span class="n">size</span><span class="o">,</span> <span class="nc">Level</span> <span class="n">pushLevel</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC161" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">target</span> <span class="o">==</span> <span class="kc">null</span> <span class="o">||</span> <span class="n">pushLevel</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC162" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">NullPointerException</span><span class="o">();</span></span>
<span id="LC163" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC164" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">size</span> <span class="o">&lt;=</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC165" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">IllegalArgumentException</span><span class="o">();</span></span>
<span id="LC166" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC167" class="line" lang="java">        <span class="n">sealed</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></span>
<span id="LC168" class="line" lang="java">        <span class="n">configure</span><span class="o">();</span></span>
<span id="LC169" class="line" lang="java">        <span class="n">sealed</span> <span class="o">=</span> <span class="kc">true</span><span class="o">;</span></span>
<span id="LC170" class="line" lang="java">        <span class="k">this</span><span class="o">.</span><span class="na">target</span> <span class="o">=</span> <span class="n">target</span><span class="o">;</span></span>
<span id="LC171" class="line" lang="java">        <span class="k">this</span><span class="o">.</span><span class="na">pushLevel</span> <span class="o">=</span> <span class="n">pushLevel</span><span class="o">;</span></span>
<span id="LC172" class="line" lang="java">        <span class="k">this</span><span class="o">.</span><span class="na">size</span> <span class="o">=</span> <span class="n">size</span><span class="o">;</span></span>
<span id="LC173" class="line" lang="java">        <span class="n">init</span><span class="o">();</span></span>
<span id="LC174" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC175" class="line" lang="java"></span>
<span id="LC176" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC177" class="line" lang="java"><span class="cm">     * Store a &lt;tt&gt;LogRecord&lt;/tt&gt; in an internal buffer.</span></span>
<span id="LC178" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC179" class="line" lang="java"><span class="cm">     * If there is a &lt;tt&gt;Filter&lt;/tt&gt;, its &lt;tt&gt;isLoggable&lt;/tt&gt;</span></span>
<span id="LC180" class="line" lang="java"><span class="cm">     * method is called to check if the given log record is loggable.</span></span>
<span id="LC181" class="line" lang="java"><span class="cm">     * If not we return.  Otherwise the given record is copied into</span></span>
<span id="LC182" class="line" lang="java"><span class="cm">     * an internal circular buffer.  Then the record's level property is</span></span>
<span id="LC183" class="line" lang="java"><span class="cm">     * compared with the &lt;tt&gt;pushLevel&lt;/tt&gt;. If the given level is</span></span>
<span id="LC184" class="line" lang="java"><span class="cm">     * greater than or equal to the &lt;tt&gt;pushLevel&lt;/tt&gt; then &lt;tt&gt;push&lt;/tt&gt;</span></span>
<span id="LC185" class="line" lang="java"><span class="cm">     * is called to write all buffered records to the target output</span></span>
<span id="LC186" class="line" lang="java"><span class="cm">     * &lt;tt&gt;Handler&lt;/tt&gt;.</span></span>
<span id="LC187" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC188" class="line" lang="java"><span class="cm">     * @param  record  description of the log event. A null record is</span></span>
<span id="LC189" class="line" lang="java"><span class="cm">     *                 silently ignored and is not published</span></span>
<span id="LC190" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC191" class="line" lang="java">    <span class="nd">@Override</span></span>
<span id="LC192" class="line" lang="java">    <span class="kd">public</span> <span class="kd">synchronized</span> <span class="kt">void</span> <span class="nf">publish</span><span class="o">(</span><span class="nc">LogRecord</span> <span class="n">record</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC193" class="line" lang="java">        <span class="k">if</span> <span class="o">(!</span><span class="n">isLoggable</span><span class="o">(</span><span class="n">record</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC194" class="line" lang="java">            <span class="k">return</span><span class="o">;</span></span>
<span id="LC195" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC196" class="line" lang="java">        <span class="kt">int</span> <span class="n">ix</span> <span class="o">=</span> <span class="o">(</span><span class="n">start</span><span class="o">+</span><span class="n">count</span><span class="o">)%</span><span class="n">buffer</span><span class="o">.</span><span class="na">length</span><span class="o">;</span></span>
<span id="LC197" class="line" lang="java">        <span class="n">buffer</span><span class="o">[</span><span class="n">ix</span><span class="o">]</span> <span class="o">=</span> <span class="n">record</span><span class="o">;</span></span>
<span id="LC198" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">count</span> <span class="o">&lt;</span> <span class="n">buffer</span><span class="o">.</span><span class="na">length</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC199" class="line" lang="java">            <span class="n">count</span><span class="o">++;</span></span>
<span id="LC200" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC201" class="line" lang="java">            <span class="n">start</span><span class="o">++;</span></span>
<span id="LC202" class="line" lang="java">            <span class="n">start</span> <span class="o">%=</span> <span class="n">buffer</span><span class="o">.</span><span class="na">length</span><span class="o">;</span></span>
<span id="LC203" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC204" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">record</span><span class="o">.</span><span class="na">getLevel</span><span class="o">().</span><span class="na">intValue</span><span class="o">()</span> <span class="o">&gt;=</span> <span class="n">pushLevel</span><span class="o">.</span><span class="na">intValue</span><span class="o">())</span> <span class="o">{</span></span>
<span id="LC205" class="line" lang="java">            <span class="n">push</span><span class="o">();</span></span>
<span id="LC206" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC207" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC208" class="line" lang="java"></span>
<span id="LC209" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC210" class="line" lang="java"><span class="cm">     * Push any buffered output to the target &lt;tt&gt;Handler&lt;/tt&gt;.</span></span>
<span id="LC211" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC212" class="line" lang="java"><span class="cm">     * The buffer is then cleared.</span></span>
<span id="LC213" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC214" class="line" lang="java">    <span class="kd">public</span> <span class="kd">synchronized</span> <span class="kt">void</span> <span class="nf">push</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC215" class="line" lang="java">        <span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">count</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span> <span class="o">{</span></span>
<span id="LC216" class="line" lang="java">            <span class="kt">int</span> <span class="n">ix</span> <span class="o">=</span> <span class="o">(</span><span class="n">start</span><span class="o">+</span><span class="n">i</span><span class="o">)%</span><span class="n">buffer</span><span class="o">.</span><span class="na">length</span><span class="o">;</span></span>
<span id="LC217" class="line" lang="java">            <span class="nc">LogRecord</span> <span class="n">record</span> <span class="o">=</span> <span class="n">buffer</span><span class="o">[</span><span class="n">ix</span><span class="o">];</span></span>
<span id="LC218" class="line" lang="java">            <span class="n">target</span><span class="o">.</span><span class="na">publish</span><span class="o">(</span><span class="n">record</span><span class="o">);</span></span>
<span id="LC219" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC220" class="line" lang="java">        <span class="c1">// Empty the buffer.</span></span>
<span id="LC221" class="line" lang="java">        <span class="n">start</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC222" class="line" lang="java">        <span class="n">count</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></span>
<span id="LC223" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC224" class="line" lang="java"></span>
<span id="LC225" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC226" class="line" lang="java"><span class="cm">     * Causes a flush on the target &lt;tt&gt;Handler&lt;/tt&gt;.</span></span>
<span id="LC227" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC228" class="line" lang="java"><span class="cm">     * Note that the current contents of the &lt;tt&gt;MemoryHandler&lt;/tt&gt;</span></span>
<span id="LC229" class="line" lang="java"><span class="cm">     * buffer are &lt;b&gt;not&lt;/b&gt; written out.  That requires a "push".</span></span>
<span id="LC230" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC231" class="line" lang="java">    <span class="nd">@Override</span></span>
<span id="LC232" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">flush</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC233" class="line" lang="java">        <span class="n">target</span><span class="o">.</span><span class="na">flush</span><span class="o">();</span></span>
<span id="LC234" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC235" class="line" lang="java"></span>
<span id="LC236" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC237" class="line" lang="java"><span class="cm">     * Close the &lt;tt&gt;Handler&lt;/tt&gt; and free all associated resources.</span></span>
<span id="LC238" class="line" lang="java"><span class="cm">     * This will also close the target &lt;tt&gt;Handler&lt;/tt&gt;.</span></span>
<span id="LC239" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC240" class="line" lang="java"><span class="cm">     * @exception  SecurityException  if a security manager exists and if</span></span>
<span id="LC241" class="line" lang="java"><span class="cm">     *             the caller does not have &lt;tt&gt;LoggingPermission("control")&lt;/tt&gt;.</span></span>
<span id="LC242" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC243" class="line" lang="java">    <span class="nd">@Override</span></span>
<span id="LC244" class="line" lang="java">    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">close</span><span class="o">()</span> <span class="kd">throws</span> <span class="nc">SecurityException</span> <span class="o">{</span></span>
<span id="LC245" class="line" lang="java">        <span class="n">target</span><span class="o">.</span><span class="na">close</span><span class="o">();</span></span>
<span id="LC246" class="line" lang="java">        <span class="n">setLevel</span><span class="o">(</span><span class="nc">Level</span><span class="o">.</span><span class="na">OFF</span><span class="o">);</span></span>
<span id="LC247" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC248" class="line" lang="java"></span>
<span id="LC249" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC250" class="line" lang="java"><span class="cm">     * Set the &lt;tt&gt;pushLevel&lt;/tt&gt;.  After a &lt;tt&gt;LogRecord&lt;/tt&gt; is copied</span></span>
<span id="LC251" class="line" lang="java"><span class="cm">     * into our internal buffer, if its level is greater than or equal to</span></span>
<span id="LC252" class="line" lang="java"><span class="cm">     * the &lt;tt&gt;pushLevel&lt;/tt&gt;, then &lt;tt&gt;push&lt;/tt&gt; will be called.</span></span>
<span id="LC253" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC254" class="line" lang="java"><span class="cm">     * @param newLevel the new value of the &lt;tt&gt;pushLevel&lt;/tt&gt;</span></span>
<span id="LC255" class="line" lang="java"><span class="cm">     * @exception  SecurityException  if a security manager exists and if</span></span>
<span id="LC256" class="line" lang="java"><span class="cm">     *             the caller does not have &lt;tt&gt;LoggingPermission("control")&lt;/tt&gt;.</span></span>
<span id="LC257" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC258" class="line" lang="java">    <span class="kd">public</span> <span class="kd">synchronized</span> <span class="kt">void</span> <span class="nf">setPushLevel</span><span class="o">(</span><span class="nc">Level</span> <span class="n">newLevel</span><span class="o">)</span> <span class="kd">throws</span> <span class="nc">SecurityException</span> <span class="o">{</span></span>
<span id="LC259" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">newLevel</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC260" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">NullPointerException</span><span class="o">();</span></span>
<span id="LC261" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC262" class="line" lang="java">        <span class="n">checkPermission</span><span class="o">();</span></span>
<span id="LC263" class="line" lang="java">        <span class="n">pushLevel</span> <span class="o">=</span> <span class="n">newLevel</span><span class="o">;</span></span>
<span id="LC264" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC265" class="line" lang="java"></span>
<span id="LC266" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC267" class="line" lang="java"><span class="cm">     * Get the &lt;tt&gt;pushLevel&lt;/tt&gt;.</span></span>
<span id="LC268" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC269" class="line" lang="java"><span class="cm">     * @return the value of the &lt;tt&gt;pushLevel&lt;/tt&gt;</span></span>
<span id="LC270" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC271" class="line" lang="java">    <span class="kd">public</span> <span class="nc">Level</span> <span class="nf">getPushLevel</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC272" class="line" lang="java">        <span class="k">return</span> <span class="n">pushLevel</span><span class="o">;</span></span>
<span id="LC273" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC274" class="line" lang="java"></span>
<span id="LC275" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC276" class="line" lang="java"><span class="cm">     * Check if this &lt;tt&gt;Handler&lt;/tt&gt; would actually log a given</span></span>
<span id="LC277" class="line" lang="java"><span class="cm">     * &lt;tt&gt;LogRecord&lt;/tt&gt; into its internal buffer.</span></span>
<span id="LC278" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC279" class="line" lang="java"><span class="cm">     * This method checks if the &lt;tt&gt;LogRecord&lt;/tt&gt; has an appropriate level and</span></span>
<span id="LC280" class="line" lang="java"><span class="cm">     * whether it satisfies any &lt;tt&gt;Filter&lt;/tt&gt;.  However it does &lt;b&gt;not&lt;/b&gt;</span></span>
<span id="LC281" class="line" lang="java"><span class="cm">     * check whether the &lt;tt&gt;LogRecord&lt;/tt&gt; would result in a "push" of the</span></span>
<span id="LC282" class="line" lang="java"><span class="cm">     * buffer contents. It will return false if the &lt;tt&gt;LogRecord&lt;/tt&gt; is null.</span></span>
<span id="LC283" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC284" class="line" lang="java"><span class="cm">     * @param record  a &lt;tt&gt;LogRecord&lt;/tt&gt;</span></span>
<span id="LC285" class="line" lang="java"><span class="cm">     * @return true if the &lt;tt&gt;LogRecord&lt;/tt&gt; would be logged.</span></span>
<span id="LC286" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC287" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC288" class="line" lang="java">    <span class="nd">@Override</span></span>
<span id="LC289" class="line" lang="java">    <span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">isLoggable</span><span class="o">(</span><span class="nc">LogRecord</span> <span class="n">record</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC290" class="line" lang="java">        <span class="k">return</span> <span class="kd">super</span><span class="o">.</span><span class="na">isLoggable</span><span class="o">(</span><span class="n">record</span><span class="o">);</span></span>
<span id="LC291" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC292" class="line" lang="java"><span class="o">}</span></span>
