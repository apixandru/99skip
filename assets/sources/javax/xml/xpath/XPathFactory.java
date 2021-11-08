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
<a class="file-line-num diff-line-num" data-line-number="293" href="#L293" id="L293">
293
</a>
<a class="file-line-num diff-line-num" data-line-number="294" href="#L294" id="L294">
294
</a>
<a class="file-line-num diff-line-num" data-line-number="295" href="#L295" id="L295">
295
</a>
<a class="file-line-num diff-line-num" data-line-number="296" href="#L296" id="L296">
296
</a>
<a class="file-line-num diff-line-num" data-line-number="297" href="#L297" id="L297">
297
</a>
<a class="file-line-num diff-line-num" data-line-number="298" href="#L298" id="L298">
298
</a>
<a class="file-line-num diff-line-num" data-line-number="299" href="#L299" id="L299">
299
</a>
<a class="file-line-num diff-line-num" data-line-number="300" href="#L300" id="L300">
300
</a>
<a class="file-line-num diff-line-num" data-line-number="301" href="#L301" id="L301">
301
</a>
<a class="file-line-num diff-line-num" data-line-number="302" href="#L302" id="L302">
302
</a>
<a class="file-line-num diff-line-num" data-line-number="303" href="#L303" id="L303">
303
</a>
<a class="file-line-num diff-line-num" data-line-number="304" href="#L304" id="L304">
304
</a>
<a class="file-line-num diff-line-num" data-line-number="305" href="#L305" id="L305">
305
</a>
<a class="file-line-num diff-line-num" data-line-number="306" href="#L306" id="L306">
306
</a>
<a class="file-line-num diff-line-num" data-line-number="307" href="#L307" id="L307">
307
</a>
<a class="file-line-num diff-line-num" data-line-number="308" href="#L308" id="L308">
308
</a>
<a class="file-line-num diff-line-num" data-line-number="309" href="#L309" id="L309">
309
</a>
<a class="file-line-num diff-line-num" data-line-number="310" href="#L310" id="L310">
310
</a>
<a class="file-line-num diff-line-num" data-line-number="311" href="#L311" id="L311">
311
</a>
<a class="file-line-num diff-line-num" data-line-number="312" href="#L312" id="L312">
312
</a>
<a class="file-line-num diff-line-num" data-line-number="313" href="#L313" id="L313">
313
</a>
<a class="file-line-num diff-line-num" data-line-number="314" href="#L314" id="L314">
314
</a>
<a class="file-line-num diff-line-num" data-line-number="315" href="#L315" id="L315">
315
</a>
<a class="file-line-num diff-line-num" data-line-number="316" href="#L316" id="L316">
316
</a>
<a class="file-line-num diff-line-num" data-line-number="317" href="#L317" id="L317">
317
</a>
<a class="file-line-num diff-line-num" data-line-number="318" href="#L318" id="L318">
318
</a>
<a class="file-line-num diff-line-num" data-line-number="319" href="#L319" id="L319">
319
</a>
<a class="file-line-num diff-line-num" data-line-number="320" href="#L320" id="L320">
320
</a>
<a class="file-line-num diff-line-num" data-line-number="321" href="#L321" id="L321">
321
</a>
<a class="file-line-num diff-line-num" data-line-number="322" href="#L322" id="L322">
322
</a>
<a class="file-line-num diff-line-num" data-line-number="323" href="#L323" id="L323">
323
</a>
<a class="file-line-num diff-line-num" data-line-number="324" href="#L324" id="L324">
324
</a>
<a class="file-line-num diff-line-num" data-line-number="325" href="#L325" id="L325">
325
</a>
<a class="file-line-num diff-line-num" data-line-number="326" href="#L326" id="L326">
326
</a>
<a class="file-line-num diff-line-num" data-line-number="327" href="#L327" id="L327">
327
</a>
<a class="file-line-num diff-line-num" data-line-number="328" href="#L328" id="L328">
328
</a>
<a class="file-line-num diff-line-num" data-line-number="329" href="#L329" id="L329">
329
</a>
<a class="file-line-num diff-line-num" data-line-number="330" href="#L330" id="L330">
330
</a>
<a class="file-line-num diff-line-num" data-line-number="331" href="#L331" id="L331">
331
</a>
<a class="file-line-num diff-line-num" data-line-number="332" href="#L332" id="L332">
332
</a>
<a class="file-line-num diff-line-num" data-line-number="333" href="#L333" id="L333">
333
</a>
<a class="file-line-num diff-line-num" data-line-number="334" href="#L334" id="L334">
334
</a>
<a class="file-line-num diff-line-num" data-line-number="335" href="#L335" id="L335">
335
</a>
<a class="file-line-num diff-line-num" data-line-number="336" href="#L336" id="L336">
336
</a>
<a class="file-line-num diff-line-num" data-line-number="337" href="#L337" id="L337">
337
</a>
<a class="file-line-num diff-line-num" data-line-number="338" href="#L338" id="L338">
338
</a>
<a class="file-line-num diff-line-num" data-line-number="339" href="#L339" id="L339">
339
</a>
<a class="file-line-num diff-line-num" data-line-number="340" href="#L340" id="L340">
340
</a>
<a class="file-line-num diff-line-num" data-line-number="341" href="#L341" id="L341">
341
</a>
<a class="file-line-num diff-line-num" data-line-number="342" href="#L342" id="L342">
342
</a>
<a class="file-line-num diff-line-num" data-line-number="343" href="#L343" id="L343">
343
</a>
<a class="file-line-num diff-line-num" data-line-number="344" href="#L344" id="L344">
344
</a>
<a class="file-line-num diff-line-num" data-line-number="345" href="#L345" id="L345">
345
</a>
<a class="file-line-num diff-line-num" data-line-number="346" href="#L346" id="L346">
346
</a>
<a class="file-line-num diff-line-num" data-line-number="347" href="#L347" id="L347">
347
</a>
<a class="file-line-num diff-line-num" data-line-number="348" href="#L348" id="L348">
348
</a>
<a class="file-line-num diff-line-num" data-line-number="349" href="#L349" id="L349">
349
</a>
<a class="file-line-num diff-line-num" data-line-number="350" href="#L350" id="L350">
350
</a>
<a class="file-line-num diff-line-num" data-line-number="351" href="#L351" id="L351">
351
</a>
<a class="file-line-num diff-line-num" data-line-number="352" href="#L352" id="L352">
352
</a>
<a class="file-line-num diff-line-num" data-line-number="353" href="#L353" id="L353">
353
</a>
<a class="file-line-num diff-line-num" data-line-number="354" href="#L354" id="L354">
354
</a>
<a class="file-line-num diff-line-num" data-line-number="355" href="#L355" id="L355">
355
</a>
<a class="file-line-num diff-line-num" data-line-number="356" href="#L356" id="L356">
356
</a>
<a class="file-line-num diff-line-num" data-line-number="357" href="#L357" id="L357">
357
</a>
<a class="file-line-num diff-line-num" data-line-number="358" href="#L358" id="L358">
358
</a>
<a class="file-line-num diff-line-num" data-line-number="359" href="#L359" id="L359">
359
</a>
<a class="file-line-num diff-line-num" data-line-number="360" href="#L360" id="L360">
360
</a>
<a class="file-line-num diff-line-num" data-line-number="361" href="#L361" id="L361">
361
</a>
<a class="file-line-num diff-line-num" data-line-number="362" href="#L362" id="L362">
362
</a>
<a class="file-line-num diff-line-num" data-line-number="363" href="#L363" id="L363">
363
</a>
<a class="file-line-num diff-line-num" data-line-number="364" href="#L364" id="L364">
364
</a>
<a class="file-line-num diff-line-num" data-line-number="365" href="#L365" id="L365">
365
</a>
<a class="file-line-num diff-line-num" data-line-number="366" href="#L366" id="L366">
366
</a>
<a class="file-line-num diff-line-num" data-line-number="367" href="#L367" id="L367">
367
</a>
<a class="file-line-num diff-line-num" data-line-number="368" href="#L368" id="L368">
368
</a>
<a class="file-line-num diff-line-num" data-line-number="369" href="#L369" id="L369">
369
</a>
<a class="file-line-num diff-line-num" data-line-number="370" href="#L370" id="L370">
370
</a>
<a class="file-line-num diff-line-num" data-line-number="371" href="#L371" id="L371">
371
</a>
<a class="file-line-num diff-line-num" data-line-number="372" href="#L372" id="L372">
372
</a>
<a class="file-line-num diff-line-num" data-line-number="373" href="#L373" id="L373">
373
</a>
<a class="file-line-num diff-line-num" data-line-number="374" href="#L374" id="L374">
374
</a>
<a class="file-line-num diff-line-num" data-line-number="375" href="#L375" id="L375">
375
</a>
<a class="file-line-num diff-line-num" data-line-number="376" href="#L376" id="L376">
376
</a>
<a class="file-line-num diff-line-num" data-line-number="377" href="#L377" id="L377">
377
</a>
<a class="file-line-num diff-line-num" data-line-number="378" href="#L378" id="L378">
378
</a>
<a class="file-line-num diff-line-num" data-line-number="379" href="#L379" id="L379">
379
</a>
<a class="file-line-num diff-line-num" data-line-number="380" href="#L380" id="L380">
380
</a>
<a class="file-line-num diff-line-num" data-line-number="381" href="#L381" id="L381">
381
</a>
<a class="file-line-num diff-line-num" data-line-number="382" href="#L382" id="L382">
382
</a>
<a class="file-line-num diff-line-num" data-line-number="383" href="#L383" id="L383">
383
</a>
<a class="file-line-num diff-line-num" data-line-number="384" href="#L384" id="L384">
384
</a>
<a class="file-line-num diff-line-num" data-line-number="385" href="#L385" id="L385">
385
</a>
<a class="file-line-num diff-line-num" data-line-number="386" href="#L386" id="L386">
386
</a>
<a class="file-line-num diff-line-num" data-line-number="387" href="#L387" id="L387">
387
</a>
<a class="file-line-num diff-line-num" data-line-number="388" href="#L388" id="L388">
388
</a>
<a class="file-line-num diff-line-num" data-line-number="389" href="#L389" id="L389">
389
</a>
<a class="file-line-num diff-line-num" data-line-number="390" href="#L390" id="L390">
390
</a>
</div>
<div class="blob-content" data-blob-id="01dd3290f8c8cbdeab0a2428d8b775a16a063bc5" data-path="src/main/java/org/apache/commons/lang3/StringUtils.java" data-qa-selector="file_content">
<pre class="code highlight"><code><span id="LC1" class="line" lang="java"><span class="cm">/*</span></span>
<span id="LC2" class="line" lang="java"><span class="cm"> * Copyright (c) 2003, 2013, Oracle and/or its affiliates. All rights reserved.</span></span>
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
<span id="LC26" class="line" lang="java"><span class="kn">package</span> <span class="nn">javax.xml.xpath</span><span class="o">;</span></span>
<span id="LC27" class="line" lang="java"></span>
<span id="LC28" class="line" lang="java"><span class="cm">/**</span></span>
<span id="LC29" class="line" lang="java"><span class="cm"> * &lt;p&gt;An &lt;code&gt;XPathFactory&lt;/code&gt; instance can be used to create</span></span>
<span id="LC30" class="line" lang="java"><span class="cm"> * {@link javax.xml.xpath.XPath} objects.&lt;/p&gt;</span></span>
<span id="LC31" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC32" class="line" lang="java"><span class="cm"> *&lt;p&gt;See {@link #newInstance(String uri)} for lookup mechanism.&lt;/p&gt;</span></span>
<span id="LC33" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC34" class="line" lang="java"><span class="cm"> * &lt;p&gt;The {@link XPathFactory} class is not thread-safe. In other words,</span></span>
<span id="LC35" class="line" lang="java"><span class="cm"> * it is the application's responsibility to ensure that at most</span></span>
<span id="LC36" class="line" lang="java"><span class="cm"> * one thread is using a {@link XPathFactory} object at any</span></span>
<span id="LC37" class="line" lang="java"><span class="cm"> * given moment. Implementations are encouraged to mark methods</span></span>
<span id="LC38" class="line" lang="java"><span class="cm"> * as &lt;code&gt;synchronized&lt;/code&gt; to protect themselves from broken clients.</span></span>
<span id="LC39" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC40" class="line" lang="java"><span class="cm"> * &lt;p&gt;{@link XPathFactory} is not re-entrant. While one of the</span></span>
<span id="LC41" class="line" lang="java"><span class="cm"> * &lt;code&gt;newInstance&lt;/code&gt; methods is being invoked, applications</span></span>
<span id="LC42" class="line" lang="java"><span class="cm"> * may not attempt to recursively invoke a &lt;code&gt;newInstance&lt;/code&gt; method,</span></span>
<span id="LC43" class="line" lang="java"><span class="cm"> * even from the same thread.</span></span>
<span id="LC44" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC45" class="line" lang="java"><span class="cm"> * @author  &lt;a href="mailto:Norman.Walsh@Sun.com"&gt;Norman Walsh&lt;/a&gt;</span></span>
<span id="LC46" class="line" lang="java"><span class="cm"> * @author  &lt;a href="mailto:Jeff.Suttor@Sun.com"&gt;Jeff Suttor&lt;/a&gt;</span></span>
<span id="LC47" class="line" lang="java"><span class="cm"> *</span></span>
<span id="LC48" class="line" lang="java"><span class="cm"> * @since 1.5</span></span>
<span id="LC49" class="line" lang="java"><span class="cm"> */</span></span>
<span id="LC50" class="line" lang="java"><span class="kd">public</span> <span class="kd">abstract</span> <span class="kd">class</span> <span class="nc">XPathFactory</span> <span class="o">{</span></span>
<span id="LC51" class="line" lang="java"></span>
<span id="LC52" class="line" lang="java"></span>
<span id="LC53" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC54" class="line" lang="java"><span class="cm">     * &lt;p&gt;The default property name according to the JAXP spec.&lt;/p&gt;</span></span>
<span id="LC55" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC56" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">DEFAULT_PROPERTY_NAME</span> <span class="o">=</span> <span class="s">"javax.xml.xpath.XPathFactory"</span><span class="o">;</span></span>
<span id="LC57" class="line" lang="java"></span>
<span id="LC58" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC59" class="line" lang="java"><span class="cm">     * &lt;p&gt;Default Object Model URI.&lt;/p&gt;</span></span>
<span id="LC60" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC61" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="kd">final</span> <span class="nc">String</span> <span class="no">DEFAULT_OBJECT_MODEL_URI</span> <span class="o">=</span> <span class="s">"http://java.sun.com/jaxp/xpath/dom"</span><span class="o">;</span></span>
<span id="LC62" class="line" lang="java"></span>
<span id="LC63" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC64" class="line" lang="java"><span class="cm">     *&lt;p&gt; Take care of restrictions imposed by java security model &lt;/p&gt;</span></span>
<span id="LC65" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC66" class="line" lang="java">    <span class="kd">private</span> <span class="kd">static</span> <span class="nc">SecuritySupport</span> <span class="n">ss</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">SecuritySupport</span><span class="o">()</span> <span class="o">;</span></span>
<span id="LC67" class="line" lang="java"></span>
<span id="LC68" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC69" class="line" lang="java"><span class="cm">     * &lt;p&gt;Protected constructor as {@link #newInstance()} or {@link #newInstance(String uri)}</span></span>
<span id="LC70" class="line" lang="java"><span class="cm">     * or {@link #newInstance(String uri, String factoryClassName, ClassLoader classLoader)}</span></span>
<span id="LC71" class="line" lang="java"><span class="cm">     * should be used to create a new instance of an &lt;code&gt;XPathFactory&lt;/code&gt;.&lt;/p&gt;</span></span>
<span id="LC72" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC73" class="line" lang="java">    <span class="kd">protected</span> <span class="nf">XPathFactory</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC74" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC75" class="line" lang="java"></span>
<span id="LC76" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC77" class="line" lang="java"><span class="cm">     * &lt;p&gt;Get a new &lt;code&gt;XPathFactory&lt;/code&gt; instance using the default object model,</span></span>
<span id="LC78" class="line" lang="java"><span class="cm">     * {@link #DEFAULT_OBJECT_MODEL_URI},</span></span>
<span id="LC79" class="line" lang="java"><span class="cm">     * the W3C DOM.&lt;/p&gt;</span></span>
<span id="LC80" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC81" class="line" lang="java"><span class="cm">     * &lt;p&gt;This method is functionally equivalent to:&lt;/p&gt;</span></span>
<span id="LC82" class="line" lang="java"><span class="cm">     * &lt;pre&gt;</span></span>
<span id="LC83" class="line" lang="java"><span class="cm">     *   newInstance(DEFAULT_OBJECT_MODEL_URI)</span></span>
<span id="LC84" class="line" lang="java"><span class="cm">     * &lt;/pre&gt;</span></span>
<span id="LC85" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC86" class="line" lang="java"><span class="cm">     * &lt;p&gt;Since the implementation for the W3C DOM is always available, this method will never fail.&lt;/p&gt;</span></span>
<span id="LC87" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC88" class="line" lang="java"><span class="cm">     * @return Instance of an &lt;code&gt;XPathFactory&lt;/code&gt;.</span></span>
<span id="LC89" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC90" class="line" lang="java"><span class="cm">     * @throws RuntimeException When there is a failure in creating an</span></span>
<span id="LC91" class="line" lang="java"><span class="cm">     *   &lt;code&gt;XPathFactory&lt;/code&gt; for the default object model.</span></span>
<span id="LC92" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC93" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="nc">XPathFactory</span> <span class="nf">newInstance</span><span class="o">()</span> <span class="o">{</span></span>
<span id="LC94" class="line" lang="java"></span>
<span id="LC95" class="line" lang="java">        <span class="k">try</span> <span class="o">{</span></span>
<span id="LC96" class="line" lang="java">                <span class="k">return</span> <span class="nf">newInstance</span><span class="o">(</span><span class="no">DEFAULT_OBJECT_MODEL_URI</span><span class="o">);</span></span>
<span id="LC97" class="line" lang="java">        <span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="nc">XPathFactoryConfigurationException</span> <span class="n">xpathFactoryConfigurationException</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC98" class="line" lang="java">                <span class="k">throw</span> <span class="k">new</span> <span class="nf">RuntimeException</span><span class="o">(</span></span>
<span id="LC99" class="line" lang="java">                        <span class="s">"XPathFactory#newInstance() failed to create an XPathFactory for the default object model: "</span></span>
<span id="LC100" class="line" lang="java">                        <span class="o">+</span> <span class="no">DEFAULT_OBJECT_MODEL_URI</span></span>
<span id="LC101" class="line" lang="java">                        <span class="o">+</span> <span class="s">" with the XPathFactoryConfigurationException: "</span></span>
<span id="LC102" class="line" lang="java">                        <span class="o">+</span> <span class="n">xpathFactoryConfigurationException</span><span class="o">.</span><span class="na">toString</span><span class="o">()</span></span>
<span id="LC103" class="line" lang="java">                <span class="o">);</span></span>
<span id="LC104" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC105" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC106" class="line" lang="java"></span>
<span id="LC107" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC108" class="line" lang="java"><span class="cm">    * &lt;p&gt;Get a new &lt;code&gt;XPathFactory&lt;/code&gt; instance using the specified object model.&lt;/p&gt;</span></span>
<span id="LC109" class="line" lang="java"><span class="cm">    *</span></span>
<span id="LC110" class="line" lang="java"><span class="cm">    * &lt;p&gt;To find a &lt;code&gt;XPathFactory&lt;/code&gt; object,</span></span>
<span id="LC111" class="line" lang="java"><span class="cm">    * this method looks the following places in the following order where "the class loader" refers to the context class loader:&lt;/p&gt;</span></span>
<span id="LC112" class="line" lang="java"><span class="cm">    * &lt;ol&gt;</span></span>
<span id="LC113" class="line" lang="java"><span class="cm">    *   &lt;li&gt;</span></span>
<span id="LC114" class="line" lang="java"><span class="cm">    *     If the system property {@link #DEFAULT_PROPERTY_NAME} + ":uri" is present,</span></span>
<span id="LC115" class="line" lang="java"><span class="cm">    *     where uri is the parameter to this method, then its value is read as a class name.</span></span>
<span id="LC116" class="line" lang="java"><span class="cm">    *     The method will try to create a new instance of this class by using the class loader,</span></span>
<span id="LC117" class="line" lang="java"><span class="cm">    *     and returns it if it is successfully created.</span></span>
<span id="LC118" class="line" lang="java"><span class="cm">    *   &lt;/li&gt;</span></span>
<span id="LC119" class="line" lang="java"><span class="cm">    *   &lt;li&gt;</span></span>
<span id="LC120" class="line" lang="java"><span class="cm">    *     ${java.home}/lib/jaxp.properties is read and the value associated with the key being the system property above is looked for.</span></span>
<span id="LC121" class="line" lang="java"><span class="cm">    *     If present, the value is processed just like above.</span></span>
<span id="LC122" class="line" lang="java"><span class="cm">    *   &lt;/li&gt;</span></span>
<span id="LC123" class="line" lang="java"><span class="cm">    *   &lt;li&gt;</span></span>
<span id="LC124" class="line" lang="java"><span class="cm">    *     Use the service-provider loading facilities, defined by the</span></span>
<span id="LC125" class="line" lang="java"><span class="cm">    *     {@link java.util.ServiceLoader} class, to attempt to locate and load an</span></span>
<span id="LC126" class="line" lang="java"><span class="cm">    *     implementation of the service using the {@linkplain</span></span>
<span id="LC127" class="line" lang="java"><span class="cm">    *     java.util.ServiceLoader#load(java.lang.Class) default loading mechanism}:</span></span>
<span id="LC128" class="line" lang="java"><span class="cm">    *     the service-provider loading facility will use the {@linkplain</span></span>
<span id="LC129" class="line" lang="java"><span class="cm">    *     java.lang.Thread#getContextClassLoader() current thread's context class loader}</span></span>
<span id="LC130" class="line" lang="java"><span class="cm">    *     to attempt to load the service. If the context class</span></span>
<span id="LC131" class="line" lang="java"><span class="cm">    *     loader is null, the {@linkplain</span></span>
<span id="LC132" class="line" lang="java"><span class="cm">    *     ClassLoader#getSystemClassLoader() system class loader} will be used.</span></span>
<span id="LC133" class="line" lang="java"><span class="cm">    *     &lt;br&gt;</span></span>
<span id="LC134" class="line" lang="java"><span class="cm">    *     Each potential service provider is required to implement the method</span></span>
<span id="LC135" class="line" lang="java"><span class="cm">    *     {@link #isObjectModelSupported(String objectModel)}.</span></span>
<span id="LC136" class="line" lang="java"><span class="cm">    *     The first service provider found that supports the specified object</span></span>
<span id="LC137" class="line" lang="java"><span class="cm">    *     model is returned.</span></span>
<span id="LC138" class="line" lang="java"><span class="cm">    *     &lt;br&gt;</span></span>
<span id="LC139" class="line" lang="java"><span class="cm">    *     In case of {@link java.util.ServiceConfigurationError} an</span></span>
<span id="LC140" class="line" lang="java"><span class="cm">    *     {@link XPathFactoryConfigurationException} will be thrown.</span></span>
<span id="LC141" class="line" lang="java"><span class="cm">    *   &lt;/li&gt;</span></span>
<span id="LC142" class="line" lang="java"><span class="cm">    *   &lt;li&gt;</span></span>
<span id="LC143" class="line" lang="java"><span class="cm">    *     Platform default &lt;code&gt;XPathFactory&lt;/code&gt; is located in a platform specific way.</span></span>
<span id="LC144" class="line" lang="java"><span class="cm">    *     There must be a platform default XPathFactory for the W3C DOM, i.e. {@link #DEFAULT_OBJECT_MODEL_URI}.</span></span>
<span id="LC145" class="line" lang="java"><span class="cm">    *   &lt;/li&gt;</span></span>
<span id="LC146" class="line" lang="java"><span class="cm">    * &lt;/ol&gt;</span></span>
<span id="LC147" class="line" lang="java"><span class="cm">    * &lt;p&gt;If everything fails, an &lt;code&gt;XPathFactoryConfigurationException&lt;/code&gt; will be thrown.&lt;/p&gt;</span></span>
<span id="LC148" class="line" lang="java"><span class="cm">    *</span></span>
<span id="LC149" class="line" lang="java"><span class="cm">    * &lt;p&gt;Tip for Trouble-shooting:&lt;/p&gt;</span></span>
<span id="LC150" class="line" lang="java"><span class="cm">    * &lt;p&gt;See {@link java.util.Properties#load(java.io.InputStream)} for exactly how a property file is parsed.</span></span>
<span id="LC151" class="line" lang="java"><span class="cm">    * In particular, colons ':' need to be escaped in a property file, so make sure the URIs are properly escaped in it.</span></span>
<span id="LC152" class="line" lang="java"><span class="cm">    * For example:&lt;/p&gt;</span></span>
<span id="LC153" class="line" lang="java"><span class="cm">    * &lt;pre&gt;</span></span>
<span id="LC154" class="line" lang="java"><span class="cm">    *   http\://java.sun.com/jaxp/xpath/dom=org.acme.DomXPathFactory</span></span>
<span id="LC155" class="line" lang="java"><span class="cm">    * &lt;/pre&gt;</span></span>
<span id="LC156" class="line" lang="java"><span class="cm">    *</span></span>
<span id="LC157" class="line" lang="java"><span class="cm">    * @param uri Identifies the underlying object model.</span></span>
<span id="LC158" class="line" lang="java"><span class="cm">    *   The specification only defines the URI {@link #DEFAULT_OBJECT_MODEL_URI},</span></span>
<span id="LC159" class="line" lang="java"><span class="cm">    *   &lt;code&gt;http://java.sun.com/jaxp/xpath/dom&lt;/code&gt; for the W3C DOM,</span></span>
<span id="LC160" class="line" lang="java"><span class="cm">    *   the org.w3c.dom package, and implementations are free to introduce other URIs for other object models.</span></span>
<span id="LC161" class="line" lang="java"><span class="cm">    *</span></span>
<span id="LC162" class="line" lang="java"><span class="cm">    * @return Instance of an &lt;code&gt;XPathFactory&lt;/code&gt;.</span></span>
<span id="LC163" class="line" lang="java"><span class="cm">    *</span></span>
<span id="LC164" class="line" lang="java"><span class="cm">    * @throws XPathFactoryConfigurationException If the specified object model</span></span>
<span id="LC165" class="line" lang="java"><span class="cm">    *      is unavailable, or if there is a configuration error.</span></span>
<span id="LC166" class="line" lang="java"><span class="cm">    * @throws NullPointerException If &lt;code&gt;uri&lt;/code&gt; is &lt;code&gt;null&lt;/code&gt;.</span></span>
<span id="LC167" class="line" lang="java"><span class="cm">    * @throws IllegalArgumentException If &lt;code&gt;uri&lt;/code&gt; is &lt;code&gt;null&lt;/code&gt;</span></span>
<span id="LC168" class="line" lang="java"><span class="cm">    *   or &lt;code&gt;uri.length() == 0&lt;/code&gt;.</span></span>
<span id="LC169" class="line" lang="java"><span class="cm">    */</span></span>
<span id="LC170" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="nc">XPathFactory</span> <span class="nf">newInstance</span><span class="o">(</span><span class="kd">final</span> <span class="nc">String</span> <span class="n">uri</span><span class="o">)</span></span>
<span id="LC171" class="line" lang="java">        <span class="kd">throws</span> <span class="nc">XPathFactoryConfigurationException</span> <span class="o">{</span></span>
<span id="LC172" class="line" lang="java"></span>
<span id="LC173" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">uri</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC174" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">NullPointerException</span><span class="o">(</span></span>
<span id="LC175" class="line" lang="java">                    <span class="s">"XPathFactory#newInstance(String uri) cannot be called with uri == null"</span><span class="o">);</span></span>
<span id="LC176" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC177" class="line" lang="java"></span>
<span id="LC178" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">uri</span><span class="o">.</span><span class="na">length</span><span class="o">()</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC179" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">IllegalArgumentException</span><span class="o">(</span></span>
<span id="LC180" class="line" lang="java">                    <span class="s">"XPathFactory#newInstance(String uri) cannot be called with uri == \"\""</span><span class="o">);</span></span>
<span id="LC181" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC182" class="line" lang="java"></span>
<span id="LC183" class="line" lang="java">        <span class="nc">ClassLoader</span> <span class="n">classLoader</span> <span class="o">=</span> <span class="n">ss</span><span class="o">.</span><span class="na">getContextClassLoader</span><span class="o">();</span></span>
<span id="LC184" class="line" lang="java"></span>
<span id="LC185" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">classLoader</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC186" class="line" lang="java">            <span class="c1">//use the current class loader</span></span>
<span id="LC187" class="line" lang="java">            <span class="n">classLoader</span> <span class="o">=</span> <span class="nc">XPathFactory</span><span class="o">.</span><span class="na">class</span><span class="o">.</span><span class="na">getClassLoader</span><span class="o">();</span></span>
<span id="LC188" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC189" class="line" lang="java"></span>
<span id="LC190" class="line" lang="java">        <span class="nc">XPathFactory</span> <span class="n">xpathFactory</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">XPathFactoryFinder</span><span class="o">(</span><span class="n">classLoader</span><span class="o">).</span><span class="na">newFactory</span><span class="o">(</span><span class="n">uri</span><span class="o">);</span></span>
<span id="LC191" class="line" lang="java"></span>
<span id="LC192" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">xpathFactory</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC193" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">XPathFactoryConfigurationException</span><span class="o">(</span></span>
<span id="LC194" class="line" lang="java">                    <span class="s">"No XPathFactory implementation found for the object model: "</span></span>
<span id="LC195" class="line" lang="java">                    <span class="o">+</span> <span class="n">uri</span><span class="o">);</span></span>
<span id="LC196" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC197" class="line" lang="java"></span>
<span id="LC198" class="line" lang="java">        <span class="k">return</span> <span class="n">xpathFactory</span><span class="o">;</span></span>
<span id="LC199" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC200" class="line" lang="java"></span>
<span id="LC201" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC202" class="line" lang="java"><span class="cm">     * &lt;p&gt;Obtain a new instance of a &lt;code&gt;XPathFactory&lt;/code&gt; from a factory class name. &lt;code&gt;XPathFactory&lt;/code&gt;</span></span>
<span id="LC203" class="line" lang="java"><span class="cm">     * is returned if specified factory class supports the specified object model.</span></span>
<span id="LC204" class="line" lang="java"><span class="cm">     * This function is useful when there are multiple providers in the classpath.</span></span>
<span id="LC205" class="line" lang="java"><span class="cm">     * It gives more control to the application as it can specify which provider</span></span>
<span id="LC206" class="line" lang="java"><span class="cm">     * should be loaded.&lt;/p&gt;</span></span>
<span id="LC207" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC208" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC209" class="line" lang="java"><span class="cm">     * &lt;h2&gt;Tip for Trouble-shooting&lt;/h2&gt;</span></span>
<span id="LC210" class="line" lang="java"><span class="cm">     * &lt;p&gt;Setting the &lt;code&gt;jaxp.debug&lt;/code&gt; system property will cause</span></span>
<span id="LC211" class="line" lang="java"><span class="cm">     * this method to print a lot of debug messages</span></span>
<span id="LC212" class="line" lang="java"><span class="cm">     * to &lt;code&gt;System.err&lt;/code&gt; about what it is doing and where it is looking at.&lt;/p&gt;</span></span>
<span id="LC213" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC214" class="line" lang="java"><span class="cm">     * &lt;p&gt; If you have problems try:&lt;/p&gt;</span></span>
<span id="LC215" class="line" lang="java"><span class="cm">     * &lt;pre&gt;</span></span>
<span id="LC216" class="line" lang="java"><span class="cm">     * java -Djaxp.debug=1 YourProgram ....</span></span>
<span id="LC217" class="line" lang="java"><span class="cm">     * &lt;/pre&gt;</span></span>
<span id="LC218" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC219" class="line" lang="java"><span class="cm">     * @param uri         Identifies the underlying object model. The specification only defines the URI</span></span>
<span id="LC220" class="line" lang="java"><span class="cm">     *                    {@link #DEFAULT_OBJECT_MODEL_URI},&lt;code&gt;http://java.sun.com/jaxp/xpath/dom&lt;/code&gt;</span></span>
<span id="LC221" class="line" lang="java"><span class="cm">     *                    for the W3C DOM, the org.w3c.dom package, and implementations are free to introduce</span></span>
<span id="LC222" class="line" lang="java"><span class="cm">     *                    other URIs for other object models.</span></span>
<span id="LC223" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC224" class="line" lang="java"><span class="cm">     * @param factoryClassName fully qualified factory class name that provides implementation of &lt;code&gt;javax.xml.xpath.XPathFactory&lt;/code&gt;.</span></span>
<span id="LC225" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC226" class="line" lang="java"><span class="cm">     * @param classLoader &lt;code&gt;ClassLoader&lt;/code&gt; used to load the factory class. If &lt;code&gt;null&lt;/code&gt;</span></span>
<span id="LC227" class="line" lang="java"><span class="cm">     *                     current &lt;code&gt;Thread&lt;/code&gt;'s context classLoader is used to load the factory class.</span></span>
<span id="LC228" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC229" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC230" class="line" lang="java"><span class="cm">     * @return New instance of a &lt;code&gt;XPathFactory&lt;/code&gt;</span></span>
<span id="LC231" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC232" class="line" lang="java"><span class="cm">     * @throws XPathFactoryConfigurationException</span></span>
<span id="LC233" class="line" lang="java"><span class="cm">     *                   if &lt;code&gt;factoryClassName&lt;/code&gt; is &lt;code&gt;null&lt;/code&gt;, or</span></span>
<span id="LC234" class="line" lang="java"><span class="cm">     *                   the factory class cannot be loaded, instantiated</span></span>
<span id="LC235" class="line" lang="java"><span class="cm">     *                   or the factory class does not support the object model specified</span></span>
<span id="LC236" class="line" lang="java"><span class="cm">     *                   in the &lt;code&gt;uri&lt;/code&gt; parameter.</span></span>
<span id="LC237" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC238" class="line" lang="java"><span class="cm">     * @throws NullPointerException If &lt;code&gt;uri&lt;/code&gt; is &lt;code&gt;null&lt;/code&gt;.</span></span>
<span id="LC239" class="line" lang="java"><span class="cm">     * @throws IllegalArgumentException If &lt;code&gt;uri&lt;/code&gt; is &lt;code&gt;null&lt;/code&gt;</span></span>
<span id="LC240" class="line" lang="java"><span class="cm">     *          or &lt;code&gt;uri.length() == 0&lt;/code&gt;.</span></span>
<span id="LC241" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC242" class="line" lang="java"><span class="cm">     * @see #newInstance()</span></span>
<span id="LC243" class="line" lang="java"><span class="cm">     * @see #newInstance(String uri)</span></span>
<span id="LC244" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC245" class="line" lang="java"><span class="cm">     * @since 1.6</span></span>
<span id="LC246" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC247" class="line" lang="java">    <span class="kd">public</span> <span class="kd">static</span> <span class="nc">XPathFactory</span> <span class="nf">newInstance</span><span class="o">(</span><span class="nc">String</span> <span class="n">uri</span><span class="o">,</span> <span class="nc">String</span> <span class="n">factoryClassName</span><span class="o">,</span> <span class="nc">ClassLoader</span> <span class="n">classLoader</span><span class="o">)</span></span>
<span id="LC248" class="line" lang="java">        <span class="kd">throws</span> <span class="nc">XPathFactoryConfigurationException</span><span class="o">{</span></span>
<span id="LC249" class="line" lang="java">        <span class="nc">ClassLoader</span> <span class="n">cl</span> <span class="o">=</span> <span class="n">classLoader</span><span class="o">;</span></span>
<span id="LC250" class="line" lang="java"></span>
<span id="LC251" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">uri</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC252" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">NullPointerException</span><span class="o">(</span></span>
<span id="LC253" class="line" lang="java">                    <span class="s">"XPathFactory#newInstance(String uri) cannot be called with uri == null"</span><span class="o">);</span></span>
<span id="LC254" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC255" class="line" lang="java"></span>
<span id="LC256" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">uri</span><span class="o">.</span><span class="na">length</span><span class="o">()</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC257" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">IllegalArgumentException</span><span class="o">(</span></span>
<span id="LC258" class="line" lang="java">                    <span class="s">"XPathFactory#newInstance(String uri) cannot be called with uri == \"\""</span><span class="o">);</span></span>
<span id="LC259" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC260" class="line" lang="java"></span>
<span id="LC261" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">cl</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC262" class="line" lang="java">            <span class="n">cl</span> <span class="o">=</span> <span class="n">ss</span><span class="o">.</span><span class="na">getContextClassLoader</span><span class="o">();</span></span>
<span id="LC263" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC264" class="line" lang="java"></span>
<span id="LC265" class="line" lang="java">        <span class="nc">XPathFactory</span> <span class="n">f</span> <span class="o">=</span> <span class="k">new</span> <span class="nc">XPathFactoryFinder</span><span class="o">(</span><span class="n">cl</span><span class="o">).</span><span class="na">createInstance</span><span class="o">(</span><span class="n">factoryClassName</span><span class="o">);</span></span>
<span id="LC266" class="line" lang="java"></span>
<span id="LC267" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">f</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></span>
<span id="LC268" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">XPathFactoryConfigurationException</span><span class="o">(</span></span>
<span id="LC269" class="line" lang="java">                    <span class="s">"No XPathFactory implementation found for the object model: "</span></span>
<span id="LC270" class="line" lang="java">                    <span class="o">+</span> <span class="n">uri</span><span class="o">);</span></span>
<span id="LC271" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC272" class="line" lang="java">        <span class="c1">//if this factory supports the given schemalanguage return this factory else thrown exception</span></span>
<span id="LC273" class="line" lang="java">        <span class="k">if</span> <span class="o">(</span><span class="n">f</span><span class="o">.</span><span class="na">isObjectModelSupported</span><span class="o">(</span><span class="n">uri</span><span class="o">))</span> <span class="o">{</span></span>
<span id="LC274" class="line" lang="java">            <span class="k">return</span> <span class="n">f</span><span class="o">;</span></span>
<span id="LC275" class="line" lang="java">        <span class="o">}</span> <span class="k">else</span> <span class="o">{</span></span>
<span id="LC276" class="line" lang="java">            <span class="k">throw</span> <span class="k">new</span> <span class="nf">XPathFactoryConfigurationException</span><span class="o">(</span><span class="s">"Factory "</span></span>
<span id="LC277" class="line" lang="java">                    <span class="o">+</span> <span class="n">factoryClassName</span> <span class="o">+</span> <span class="s">" doesn't support given "</span> <span class="o">+</span> <span class="n">uri</span></span>
<span id="LC278" class="line" lang="java">                    <span class="o">+</span> <span class="s">" object model"</span><span class="o">);</span></span>
<span id="LC279" class="line" lang="java">        <span class="o">}</span></span>
<span id="LC280" class="line" lang="java"></span>
<span id="LC281" class="line" lang="java">    <span class="o">}</span></span>
<span id="LC282" class="line" lang="java"></span>
<span id="LC283" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC284" class="line" lang="java"><span class="cm">     * &lt;p&gt;Is specified object model supported by this &lt;code&gt;XPathFactory&lt;/code&gt;?&lt;/p&gt;</span></span>
<span id="LC285" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC286" class="line" lang="java"><span class="cm">     * @param objectModel Specifies the object model which the returned &lt;code&gt;XPathFactory&lt;/code&gt; will understand.</span></span>
<span id="LC287" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC288" class="line" lang="java"><span class="cm">     * @return &lt;code&gt;true&lt;/code&gt; if &lt;code&gt;XPathFactory&lt;/code&gt; supports &lt;code&gt;objectModel&lt;/code&gt;, else &lt;code&gt;false&lt;/code&gt;.</span></span>
<span id="LC289" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC290" class="line" lang="java"><span class="cm">     * @throws NullPointerException If &lt;code&gt;objectModel&lt;/code&gt; is &lt;code&gt;null&lt;/code&gt;.</span></span>
<span id="LC291" class="line" lang="java"><span class="cm">     * @throws IllegalArgumentException If &lt;code&gt;objectModel.length() == 0&lt;/code&gt;.</span></span>
<span id="LC292" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC293" class="line" lang="java">    <span class="kd">public</span> <span class="kd">abstract</span> <span class="kt">boolean</span> <span class="nf">isObjectModelSupported</span><span class="o">(</span><span class="nc">String</span> <span class="n">objectModel</span><span class="o">);</span></span>
<span id="LC294" class="line" lang="java"></span>
<span id="LC295" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC296" class="line" lang="java"><span class="cm">     * &lt;p&gt;Set a feature for this &lt;code&gt;XPathFactory&lt;/code&gt; and</span></span>
<span id="LC297" class="line" lang="java"><span class="cm">     * &lt;code&gt;XPath&lt;/code&gt;s created by this factory.&lt;/p&gt;</span></span>
<span id="LC298" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC299" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC300" class="line" lang="java"><span class="cm">     * Feature names are fully qualified {@link java.net.URI}s.</span></span>
<span id="LC301" class="line" lang="java"><span class="cm">     * Implementations may define their own features.</span></span>
<span id="LC302" class="line" lang="java"><span class="cm">     * An {@link XPathFactoryConfigurationException} is thrown if this</span></span>
<span id="LC303" class="line" lang="java"><span class="cm">     * &lt;code&gt;XPathFactory&lt;/code&gt; or the &lt;code&gt;XPath&lt;/code&gt;s</span></span>
<span id="LC304" class="line" lang="java"><span class="cm">     * it creates cannot support the feature.</span></span>
<span id="LC305" class="line" lang="java"><span class="cm">     * It is possible for an &lt;code&gt;XPathFactory&lt;/code&gt; to expose a feature value</span></span>
<span id="LC306" class="line" lang="java"><span class="cm">     * but be unable to change its state.</span></span>
<span id="LC307" class="line" lang="java"><span class="cm">     * &lt;/p&gt;</span></span>
<span id="LC308" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC309" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC310" class="line" lang="java"><span class="cm">     * All implementations are required to support the {@link javax.xml.XMLConstants#FEATURE_SECURE_PROCESSING} feature.</span></span>
<span id="LC311" class="line" lang="java"><span class="cm">     * When the feature is &lt;code&gt;true&lt;/code&gt;, any reference to  an external function is an error.</span></span>
<span id="LC312" class="line" lang="java"><span class="cm">     * Under these conditions, the implementation must not call the {@link XPathFunctionResolver}</span></span>
<span id="LC313" class="line" lang="java"><span class="cm">     * and must throw an {@link XPathFunctionException}.</span></span>
<span id="LC314" class="line" lang="java"><span class="cm">     * &lt;/p&gt;</span></span>
<span id="LC315" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC316" class="line" lang="java"><span class="cm">     * @param name Feature name.</span></span>
<span id="LC317" class="line" lang="java"><span class="cm">     * @param value Is feature state &lt;code&gt;true&lt;/code&gt; or &lt;code&gt;false&lt;/code&gt;.</span></span>
<span id="LC318" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC319" class="line" lang="java"><span class="cm">     * @throws XPathFactoryConfigurationException if this &lt;code&gt;XPathFactory&lt;/code&gt; or the &lt;code&gt;XPath&lt;/code&gt;s</span></span>
<span id="LC320" class="line" lang="java"><span class="cm">     *   it creates cannot support this feature.</span></span>
<span id="LC321" class="line" lang="java"><span class="cm">     * @throws NullPointerException if &lt;code&gt;name&lt;/code&gt; is &lt;code&gt;null&lt;/code&gt;.</span></span>
<span id="LC322" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC323" class="line" lang="java">    <span class="kd">public</span> <span class="kd">abstract</span> <span class="kt">void</span> <span class="nf">setFeature</span><span class="o">(</span><span class="nc">String</span> <span class="n">name</span><span class="o">,</span> <span class="kt">boolean</span> <span class="n">value</span><span class="o">)</span></span>
<span id="LC324" class="line" lang="java">            <span class="kd">throws</span> <span class="nc">XPathFactoryConfigurationException</span><span class="o">;</span></span>
<span id="LC325" class="line" lang="java"></span>
<span id="LC326" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC327" class="line" lang="java"><span class="cm">     * &lt;p&gt;Get the state of the named feature.&lt;/p&gt;</span></span>
<span id="LC328" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC329" class="line" lang="java"><span class="cm">     * &lt;p&gt;</span></span>
<span id="LC330" class="line" lang="java"><span class="cm">     * Feature names are fully qualified {@link java.net.URI}s.</span></span>
<span id="LC331" class="line" lang="java"><span class="cm">     * Implementations may define their own features.</span></span>
<span id="LC332" class="line" lang="java"><span class="cm">     * An {@link XPathFactoryConfigurationException} is thrown if this</span></span>
<span id="LC333" class="line" lang="java"><span class="cm">     * &lt;code&gt;XPathFactory&lt;/code&gt; or the &lt;code&gt;XPath&lt;/code&gt;s</span></span>
<span id="LC334" class="line" lang="java"><span class="cm">     * it creates cannot support the feature.</span></span>
<span id="LC335" class="line" lang="java"><span class="cm">     * It is possible for an &lt;code&gt;XPathFactory&lt;/code&gt; to expose a feature value</span></span>
<span id="LC336" class="line" lang="java"><span class="cm">     * but be unable to change its state.</span></span>
<span id="LC337" class="line" lang="java"><span class="cm">     * &lt;/p&gt;</span></span>
<span id="LC338" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC339" class="line" lang="java"><span class="cm">     * @param name Feature name.</span></span>
<span id="LC340" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC341" class="line" lang="java"><span class="cm">     * @return State of the named feature.</span></span>
<span id="LC342" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC343" class="line" lang="java"><span class="cm">     * @throws XPathFactoryConfigurationException if this</span></span>
<span id="LC344" class="line" lang="java"><span class="cm">     *   &lt;code&gt;XPathFactory&lt;/code&gt; or the &lt;code&gt;XPath&lt;/code&gt;s</span></span>
<span id="LC345" class="line" lang="java"><span class="cm">     *   it creates cannot support this feature.</span></span>
<span id="LC346" class="line" lang="java"><span class="cm">     * @throws NullPointerException if &lt;code&gt;name&lt;/code&gt; is &lt;code&gt;null&lt;/code&gt;.</span></span>
<span id="LC347" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC348" class="line" lang="java">    <span class="kd">public</span> <span class="kd">abstract</span> <span class="kt">boolean</span> <span class="nf">getFeature</span><span class="o">(</span><span class="nc">String</span> <span class="n">name</span><span class="o">)</span></span>
<span id="LC349" class="line" lang="java">            <span class="kd">throws</span> <span class="nc">XPathFactoryConfigurationException</span><span class="o">;</span></span>
<span id="LC350" class="line" lang="java"></span>
<span id="LC351" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC352" class="line" lang="java"><span class="cm">     * &lt;p&gt;Establish a default variable resolver.&lt;/p&gt;</span></span>
<span id="LC353" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC354" class="line" lang="java"><span class="cm">     * &lt;p&gt;Any &lt;code&gt;XPath&lt;/code&gt; objects constructed from this factory will use</span></span>
<span id="LC355" class="line" lang="java"><span class="cm">     * the specified resolver by default.&lt;/p&gt;</span></span>
<span id="LC356" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC357" class="line" lang="java"><span class="cm">     * &lt;p&gt;A &lt;code&gt;NullPointerException&lt;/code&gt; is thrown if &lt;code&gt;resolver&lt;/code&gt;</span></span>
<span id="LC358" class="line" lang="java"><span class="cm">     * is &lt;code&gt;null&lt;/code&gt;.&lt;/p&gt;</span></span>
<span id="LC359" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC360" class="line" lang="java"><span class="cm">     * @param resolver Variable resolver.</span></span>
<span id="LC361" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC362" class="line" lang="java"><span class="cm">     * @throws NullPointerException If &lt;code&gt;resolver&lt;/code&gt; is</span></span>
<span id="LC363" class="line" lang="java"><span class="cm">     *   &lt;code&gt;null&lt;/code&gt;.</span></span>
<span id="LC364" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC365" class="line" lang="java">    <span class="kd">public</span> <span class="kd">abstract</span> <span class="kt">void</span> <span class="nf">setXPathVariableResolver</span><span class="o">(</span><span class="nc">XPathVariableResolver</span> <span class="n">resolver</span><span class="o">);</span></span>
<span id="LC366" class="line" lang="java"></span>
<span id="LC367" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC368" class="line" lang="java"><span class="cm">     * &lt;p&gt;Establish a default function resolver.&lt;/p&gt;</span></span>
<span id="LC369" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC370" class="line" lang="java"><span class="cm">     * &lt;p&gt;Any &lt;code&gt;XPath&lt;/code&gt; objects constructed from this factory will</span></span>
<span id="LC371" class="line" lang="java"><span class="cm">     * use the specified resolver by default.&lt;/p&gt;</span></span>
<span id="LC372" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC373" class="line" lang="java"><span class="cm">     * &lt;p&gt;A &lt;code&gt;NullPointerException&lt;/code&gt; is thrown if</span></span>
<span id="LC374" class="line" lang="java"><span class="cm">     * &lt;code&gt;resolver&lt;/code&gt; is &lt;code&gt;null&lt;/code&gt;.&lt;/p&gt;</span></span>
<span id="LC375" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC376" class="line" lang="java"><span class="cm">     * @param resolver XPath function resolver.</span></span>
<span id="LC377" class="line" lang="java"><span class="cm">     *</span></span>
<span id="LC378" class="line" lang="java"><span class="cm">     * @throws NullPointerException If &lt;code&gt;resolver&lt;/code&gt; is</span></span>
<span id="LC379" class="line" lang="java"><span class="cm">     *   &lt;code&gt;null&lt;/code&gt;.</span></span>
<span id="LC380" class="line" lang="java"><span class="cm">     */</span></span>
<span id="LC381" class="line" lang="java">    <span class="kd">public</span> <span class="kd">abstract</span> <span class="kt">void</span> <span class="nf">setXPathFunctionResolver</span><span class="o">(</span><span class="nc">XPathFunctionResolver</span> <span class="n">resolver</span><span class="o">);</span></span>
<span id="LC382" class="line" lang="java"></span>
<span id="LC383" class="line" lang="java">    <span class="cm">/**</span></span>
<span id="LC384" class="line" lang="java"><span class="cm">    * &lt;p&gt;Return a new &lt;code&gt;XPath&lt;/code&gt; using the underlying object</span></span>
<span id="LC385" class="line" lang="java"><span class="cm">    * model determined when the &lt;code&gt;XPathFactory&lt;/code&gt; was instantiated.&lt;/p&gt;</span></span>
<span id="LC386" class="line" lang="java"><span class="cm">    *</span></span>
<span id="LC387" class="line" lang="java"><span class="cm">    * @return New instance of an &lt;code&gt;XPath&lt;/code&gt;.</span></span>
<span id="LC388" class="line" lang="java"><span class="cm">    */</span></span>
<span id="LC389" class="line" lang="java">    <span class="kd">public</span> <span class="kd">abstract</span> <span class="nc">XPath</span> <span class="nf">newXPath</span><span class="o">();</span></span>
<span id="LC390" class="line" lang="java"><span class="o">}</span></span>
